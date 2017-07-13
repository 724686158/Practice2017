package service;
import model.User;

import java.util.List;
/**
 * Created by Administrator on 2017/7/11.
 */
public interface UserService {
    User load(String id);

    User get(String id);

    List<User> findAll();

    void persist(User entity);

    String save(User entity);

    void saveOrUpdate(User entity);

    void delete(String id);

    void flush();
}
