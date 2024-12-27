package imedi.springMVC.service;

import imedi.springMVC.dao.UserDao;
import imedi.springMVC.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(Long id) {
        return userDao.findById(id);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void delete(Long id) {
        userDao.delete(id);
    }

    public void update(User user) {
        userDao.update(user);
    }
}

