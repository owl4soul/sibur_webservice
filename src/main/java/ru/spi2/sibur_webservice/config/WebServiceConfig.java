package ru.spi2.sibur_webservice.config;

/**
 * Конфиг спрингового диспетчера сервлетов для приема запросов.
 */

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * @EnableWs enables SOAP Web Service features in this Spring Boot application.
 * The WebServiceConfig class extends the WsConfigurerAdapter base class,
 * which configures the annotation-driven Spring-WS programming model.
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    // bean definitions

    /**
     * Бин MessageDispatcherServlet для обработки SOAP-запросов.
     */
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        // Это преобразует атрибут местоположения soap: address в WSDL, чтобы он отражал URL-адрес входящего запроса.
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    /**
     * Бин DefaultWsdl11Definition.
     * Это предоставляет стандарт WSDL 1.1 с использованием XsdSchema. Имя WSDL будет таким же, как имя бина.
     */
    @Bean(name = "ias_data_types")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CounterpartyControlServicePort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://spi2.ru/jaxws/datatypes");
        wsdl11Definition.setSchema(countriesSchema);
        return wsdl11Definition;
    }

    /**
     * Бин представления xsd-схемы XsdSchema
     */
    @Bean
    public XsdSchema countriesSchema() {
        // в качестве ресурса передаем нашу схему из специальной папки resources
        return new SimpleXsdSchema(new ClassPathResource("schema/xsd/ias_data_types.xsd"));
    }
}
