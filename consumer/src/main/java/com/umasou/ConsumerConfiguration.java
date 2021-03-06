package com.umasou;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.umasuo.action")
@PropertySource("classpath:/consumer.properties")
public class ConsumerConfiguration {

}
