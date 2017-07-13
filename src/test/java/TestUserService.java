import model.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

import java.util.Date;
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
        User acctUser = new User();
        acctUser.setId("100");
        acctUser.setNickName("andy");
        acctUser.setRegisterTime(new Date());
        acctUser.setTelephone("13022221111");
        userService.save(acctUser);
    }
}