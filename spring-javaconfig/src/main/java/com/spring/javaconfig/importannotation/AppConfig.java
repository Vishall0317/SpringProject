package com.spring.javaconfig.importannotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
 * annotate with @Configuration to tell spring that this is the core
 * spring configuration file, and define bean via @Bean
 */

@Configuration
@Import({StudentConfig.class, AddressConfig.class})
public class AppConfig {

	
	
	}

