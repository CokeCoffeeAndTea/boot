package project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import project.bean.User;
import project.service.UserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    UserService userService;
    @Test
    public void test(){
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

}
