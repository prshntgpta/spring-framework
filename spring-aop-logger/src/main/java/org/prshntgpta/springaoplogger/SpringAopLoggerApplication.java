package org.prshntgpta.springaoplogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "org.prshntgpta.springaoplogger")
public class SpringAopLoggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopLoggerApplication.class, args);
    }

}
