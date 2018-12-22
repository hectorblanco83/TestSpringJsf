package com.hb.setup;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * Configuration class for spring context.
 * Set's packages for Spring's component scan and imports the Spring MVC configuration
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.hb")
public class SpringConfiguration implements WebMvcConfigurer {

}