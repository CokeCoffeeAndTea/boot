package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 自动配置原理：
 *  分析源码：
 *      1、@SpringBootConfiguration(springboot提供)用于声明配置类  等价于@Configuration(spring提供)
 *      2、@EnableAutoConfiguration自动配置注解。框架底层提供大量的配置类，无需编写配置，直接用即可
 *      3、@ComponentScan用于设置扫描包，如果不设置这个注解，默认扫描main程序所在报以及子包
 *
 *
 *
 *
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
//        System.out.println(run.getBean("user"));
//        User(username=zxw, password=123)
    }

}
