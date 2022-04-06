package net.travel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


	
	@Configuration
	@EnableWebMvc
	@ComponentScan("net.travel")
	public class WebMvcConfig implements WebMvcConfigurer {
		@Bean
	    public InternalResourceViewResolver getViewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setPrefix("/WEB-INF/views/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
		}
		@Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/views/**")
	        .addResourceLocations("/WEB-INF/views/");
			registry.addResourceHandler("/images/**")
	        .addResourceLocations("/WEB-INF/views/images/");
	        

	           registry.addResourceHandler("/csslog/**")
	        .addResourceLocations("/WEB-INF/views/login/csslog/");

	        registry.addResourceHandler("/css/**")
	                .addResourceLocations("/WEB-INF/views/css/");

	        registry.addResourceHandler("/js/**")
	                .addResourceLocations("/WEB-INF/views/js/");
		}

		
	

}
