package com.lilac.jersey.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * <p>
 * 
 * </p>
 * @author ${Author}
 * @version ${Version}
 * @since 9.1.0
 *
 */
@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.lilac.jersey");
        // property("contextConfigLocation", "classpath:com/lilac/jersey/conf/applicationContext.xml");
    }

}
