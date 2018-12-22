package com.hb.setup;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;


/**
 * Spring WebAppInitialiazer. If the app's deployed over Servlet 3.0, can replace configuration on web.xml.
 */
public class SpringWebInitializer implements WebApplicationInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext) {
		
		/*
		 * Create Spring context based on annotations and annotated classes.
		 */
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		
		
		/*
		 * Register our configuration class on this new spring context.
		 *
		 * Pointing this to SpringConfiguration, will make spring scan the package com.hb,
		 * defined in SpringConfiguration ComponentScan annotation.
		 *
		 * Spring will then create all beans that have one of it's stereotype annotation.
		 */
		context.register(SpringConfiguration.class);
		
		
		/*
		 * Add Spring context within a new ServletContext Listener.
		 *
		 * This is like create a new <listener> within web.xml that listens to
		 * events about ServletContext lifecycle changes.
		 *
		 * As soon as the ServletContext for this application will be created,
		 * Spring will execute its component scan and create all the beans.
		 */
		servletContext.addListener(new ContextLoaderListener(context));
	}
	
}