package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();

    public void saveUser(User user);

    public User getUser(Long id);

    public void deleteUser(Long id);
}