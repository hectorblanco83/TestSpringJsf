package com.hb.setup;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * Useful class to retrieve Spring context anywhere in the app.
 * Annotated with @{@link Component} to allow spring's scan to retrieve this Bean
 */
@Component
public class SpringContextProvider implements ApplicationContextAware {
	
	public static ApplicationContext CONTEXT;
	
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		CONTEXT = applicationContext;
	}
}
