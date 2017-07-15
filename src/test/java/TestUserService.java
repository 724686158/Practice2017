import model.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

/**
 * 创建时间：2015-2-6 下午3:31:07
 *
 * @author andy
 * @version 2.2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
        "classpath:spring-hibernate.xml" })
public class TestUserService {

    private static final Logger LOGGER = Logger
            .getLogger(TestUserService.class);

    @Autowired
    private UserService userService;
    @Test
    public void save() {
        User user = new User();
        user.setSex("男");
        user.setEmail("zj@163.com");
        user.setName("周俊");
        user.setPhone("17854258209");
        user.setPwd("zj5363");
        userService.save(user);
    }
}