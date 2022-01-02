package project.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix = "user")
@Data
public class UserYml implements Serializable {
    private String username;
    private String password;
}
