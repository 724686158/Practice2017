package service.impl;

/**
 * Created by Administrator on 2017/7/11.
 */
import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

/**
 * 创建时间：2015-2-6 下午3:24:16
 *
 * @author andy
 * @version 2.2 UserService 的实现
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User load(String id) {
        return userDao.load(id);
    }

    @Override
    public User get(String id) {
        return userDao.get(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void persist(User entity) {
        userDao.persist(entity);
    }

    @Override
    public String save(User entity) {
        return userDao.save(entity);
    }

    @Override
    public void saveOrUpdate(User entity) {
        userDao.saveOrUpdate(entity);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public void flush() {
        userDao.flush();
    }

}
