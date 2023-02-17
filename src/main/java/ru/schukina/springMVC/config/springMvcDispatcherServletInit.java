package ru.schukina.springMVC.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class springMvcDispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{springConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
