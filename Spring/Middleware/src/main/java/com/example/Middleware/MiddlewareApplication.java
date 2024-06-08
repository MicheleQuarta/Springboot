package com.example.Middleware;

import com.example.Middleware.interceptors.APILoggingInterceptor;
import com.example.Middleware.interceptors.LegacyInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MiddlewareApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(MiddlewareApplication.class, args);
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new APILoggingInterceptor());
		registry.addInterceptor(new LegacyInterceptor());
	}

}
