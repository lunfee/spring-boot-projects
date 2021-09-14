package com.lou.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class SpringBootWebMvcConfigurer implements WebMvcConfigurer {
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String osname = System.getProperty("os.name");
        if(osname.toLowerCase().startsWith("win")){

            registry.addResourceHandler("/uploads/**").addResourceLocations("file:C:\\Users\\lunfee\\Desktop\\");
        }else{

//        registry.addResourceHandler("/files/**").addResourceLocations("file:/home/project/upload/");
        }
    }
}
