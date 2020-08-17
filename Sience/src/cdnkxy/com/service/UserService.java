package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.entity.User;

/*
 * 业务逻辑层
 * 和dao层相对应
 */
public interface UserService {
	public List<User> login(User user);
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User findUserById(int id);
	public User findUserByName(String name);
	public List<User> findAll();
}
