package com.haulmont.mvc.config.web;

import com.haulmont.mvc.config.app.AppConfig;
import com.haulmont.mvc.config.root.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author degtyarjov
 * @version $Id$
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"*.do"};//if there is /* - jsp will be handled with the same dispatcher servlet and would not work at all
    }
}