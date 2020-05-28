package ru.spi2.sibur_webservice.config;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lera.feoktistova on 27.05.2020.
 */
@Component
public class AuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

	/**
	 * Для вывода клиенту сообщения об ошибке аутентификации.
	 */
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws
																														  IOException,
																														  ServletException {
//		super.commence(request, response, authException);
		response.addHeader("WWW-Authenticate", "Basic realm=" + getRealmName());
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

		PrintWriter writer = response.getWriter();
		writer.println("Authentication Exception: " + authException.getMessage());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// RealmName appears in the login window (Firefox).
		setRealmName("sibur_apvka");
		super.afterPropertiesSet();
	}
}
