package project.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import project.bean.User;

public interface UserJpaMapper extends JpaRepository<User,Integer> {
}
