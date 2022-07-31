package org.prshntgpta.springaoplogger.listeners;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ApplicationContextListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        System.out.println(applicationContext.getApplicationName());
        String applicationNameFromProperty = applicationContext.getEnvironment().getProperty("spring.application.name");
        System.out.println("applicationNameFromProperty:"+applicationNameFromProperty);
        String developerName = applicationContext.getEnvironment().getProperty("developer." +
                "name");
        System.out.println("developerName:"+developerName);
        // now you can do applicationContext.getBean(...)
        // ...
    }
}
