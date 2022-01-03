package project.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity // 声明当前类是一个实体类
@Table(name = "user") // 实体类与哪个表进行映射
@Data
public class User implements Serializable {
    @Id //声明当前字段是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//GenerationType.IDENTITY相当于表的auto_increment
    private Integer id;
    @Column(name="username")
    private String username;
    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;
}
