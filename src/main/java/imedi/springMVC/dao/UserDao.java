package imedi.springMVC.dao;

import imedi.springMVC.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void delete(Long id);
    void update(User user);
}
