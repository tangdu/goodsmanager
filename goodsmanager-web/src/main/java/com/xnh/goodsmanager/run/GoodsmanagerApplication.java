package com.xnh.goodsmanager.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ImportResource("classpath:dubbo/*.xml")
@ComponentScan(basePackages = {"com.xnh.goodsmanager.web", "com.xnh.goodsmanager.integration.service"})
public class GoodsmanagerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GoodsmanagerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GoodsmanagerApplication.class);
    }
}