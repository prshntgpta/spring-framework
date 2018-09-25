/**
 * 
 */
package org.prshntgpta.core;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gupta
 *
 */

@Configuration
public class SpringConfig {

	@Bean(autowire = Autowire.BY_TYPE)
	public Car car() {
		 return new Car();
	}
	
	
	@Bean
    public RequiredAnnotationBeanPostProcessor processor () {
        return new RequiredAnnotationBeanPostProcessor() {
            @Override
            protected boolean shouldSkip (ConfigurableListableBeanFactory beanFactory,
                                          String beanName) {
                if (beanName.equals("car")) {
                    return false;
                }
                return super.shouldSkip(beanFactory, beanName);
            }
        };
    }
	
	@Bean   //Remove this statement to see BeanInitializationException
	public TransmissionService transmissionService() {
		return new TransmissionService();
	}
}
