package edu.t1.task5.service;

import edu.t1.task5.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    //public void createUser(Long id, String username) throws SQLException;
    public User getUserByUsername(String username) throws SQLException;
    //public void updateUser(Long id, String username) throws SQLException;
    //public void deleteUser(String username) throws SQLException;
    public List<User> getAllBy() throws SQLException;
}
