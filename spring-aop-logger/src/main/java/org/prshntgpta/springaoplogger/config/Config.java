package org.prshntgpta.springaoplogger.config;

import org.prshntgpta.springaoplogger.interceptors.CustomInterceptor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

@Configuration
public class Config implements WebMvcConfigurer {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(
//                new WebRequestHandlerInterceptorAdapter(
//                        (WebRequestInterceptor) new CustomInterceptor()));
//    }
}
