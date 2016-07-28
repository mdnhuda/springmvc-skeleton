package com.hello.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author naimul.huda(mdnhudaATgmail.com)
 * @since 1/31/16
 */
@Configuration
@EnableWebMvc
@ComponentScan({"com.hello.controller,com.hello.service"})
public class HelloServletConfig {
}
