/**
 * 
 */
package org.prshntgpta.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gupta
 *
 */
public class MainApp {

	public static void main(String... args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("spring-config.xml");

		// ApplicationContext context = new FileSystemXmlApplicationContext
		// ("C:\\Users\\gupta\\eclipse-workspace-spring\\spring-core\\src\\main\\resources\\spring-config.xml");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringConfig.class);
		context.refresh();
		Car car = (Car) context.getBean(Car.class);
		Boolean isAutomatic = car.getIsAutomatic();
		System.out.println("Value of isAutomatic = " + isAutomatic.booleanValue());
		context.close();
	}
}
