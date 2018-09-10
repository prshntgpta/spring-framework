/**
 * 
 */
package org.prshntgpta.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gupta
 *
 */

@Configuration
public class SpringConfig {

	@Bean
	public Car car() {
		return new Car(new TransmissionService());
	}
}
