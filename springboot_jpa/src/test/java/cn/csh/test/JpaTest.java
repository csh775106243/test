package cn.csh.test;

import cn.csh.SpringbootJpaApplication;
import cn.csh.dao.UserDao;
import cn.csh.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Sihao.Chen
 * @version V1.0
 * @Package cn.csh.test
 * @date 2020/2/11 14:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class JpaTest {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void find() {
        User user = userDao.findById(1l).get();
        System.out.println(user);
    }

    @Test
    public void save() {
        User user = new User();
        user.setName("aaaaa");
        userDao.save(user);
    }

    @Test
    public void redisTest() {
//        String user = redisTemplate.boundValueOps("user").get();
//        System.out.println(user);
        Boolean b = redisTemplate.delete("user");
        System.out.println(b);
    }

}
