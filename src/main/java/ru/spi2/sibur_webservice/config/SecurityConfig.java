package ru.spi2.sibur_webservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;

/**
 * Created by lera.feoktistova on 27.05.2020.
 */
@Configuration
@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * Для информирования пользователя при провале аутентификации
	 */
	@Resource
	private AuthenticationEntryPoint authenticationEntryPoint;

	/**
	 * Имя пользователя, заданное в application.properties, для доступа к сервисам через BasicAuth
	 */
	@Value("${ws.security.username}")
	private String username;

	/**
	 * Пароль, заданный в application.properties, для доступа к сервисам через BasicAuth
	 */
	@Value("${ws.security.password}")
	private String password;

	/**
	 * Настройка, отвечающая за включение/отключение использования BasicAuth для доступа к сервисам
	 */
	@Value("${ws.security.enabled}")
	private boolean securityEnabled;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// {noop} Это обработает пароль, активировав NoOpPasswordEncoder
		// вместо используемого по умолчанию DelegatingPasswordEncoder, и обработает пароль как обычный текст.
		// Так делать не рекомендуется. Временное решение.
		auth.inMemoryAuthentication().withUser(username).password("{noop}" + password).roles("USER");
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		if (!securityEnabled) {
			http.authorizeRequests().antMatchers("/**").permitAll().and().csrf().disable();
		} else {
//			http.authorizeRequests().antMatchers("/ws/**").hasRole("USER").and().authorizeRequests()
//				.antMatchers("/status*").hasRole("USER").and().authorizeRequests().antMatchers("/**").permitAll().and()
//				.httpBasic().and().csrf().disable();

			http.csrf().disable();

			// All requests send to the Web Server request must be authenticated
			http.authorizeRequests().anyRequest().authenticated();

			// Use AuthenticationEntryPoint to authenticate user/password
			// Для вывода пользователю любого сообщения при ошибке аутентификации
			http.httpBasic().authenticationEntryPoint(authenticationEntryPoint);
		}
	}
}
