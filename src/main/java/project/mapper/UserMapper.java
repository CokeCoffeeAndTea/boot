package project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import project.bean.User;

import java.util.List;

//@Repository 接口代理对象 由 Spring IOC容器管理 配合@MapperScan("project.mapper")使用
@Mapper //接口代理对象由Mybatis框架管理
public interface UserMapper {
//   @Select("select * from User")
   public List<User> findAll();
}
