package project.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import project.bean.UserYml;

/**
 * 注解开发代替XML：
 *  1、注解代码面向对象编程，是Java程序代码 而XML面向结构化的编程(扩展标记语言)
 *  2、注解代码，当然是通过JVM加装解析运行，比xml通过dom4j解析效率高
 *  3.在写业务代码过程中，配置就自然写完了
 */
//@Configuration 声明一个配置类 一个配置就相当于一个XML配置文件
@SpringBootConfiguration  // 等价于@Configuration
public class AppConfig {
    @Bean //声明bean对象 等价于<bean id="user" class = "project.bean.uUser"></bean>
    public UserYml user(){
        return new UserYml();
    }
}
