package com.yuge.readmybatis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @Author zhongcanyu
 * @Date 2024/1/23
 */
@Component
public class BeanInfoPrinter implements ApplicationListener<ContextRefreshedEvent> {

    private ApplicationContext applicationContext;

    public BeanInfoPrinter(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
//        System.out.println("Spring 容器中管理的所有 Bean 信息：");
//        for (String beanName : beanNames) {
//            ConfigurableApplicationContext configurableApplicationContext= (ConfigurableApplicationContext) applicationContext;
//            BeanDefinition beanDefinition = configurableApplicationContext.getBeanFactory().getBeanDefinition(beanName);
//
//            System.out.println("Bean Name: " + beanName);
//            System.out.println("Bean Type: " + applicationContext.getType(beanName));
//            System.out.println("Bean Definition: " + beanDefinition);
//            System.out.println("------------------------------");
//        }
    }
}
