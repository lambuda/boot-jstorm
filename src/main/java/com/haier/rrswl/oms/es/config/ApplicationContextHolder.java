package com.haier.rrswl.oms.es.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description 应用上下文对象获取holder
 * @Date 2019/12/10 9:47
 * @Created by 01437768
 */
@Component
public class ApplicationContextHolder implements ApplicationContextAware {

    /**
     * 上下文对象实例
     */
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static <T> T getBean(Class<T> t) {
        return applicationContext.getBean(t);
    }

    public static <T> Map<String, T> getBeansOfType(Class<T> t) {
        return applicationContext.getBeansOfType(t);
    }

    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }
}
