package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.dao.UserDAO;
import cdnkxy.com.entity.User;

public class UserServiceImpl implements UserService{
	UserDAO userDAO;
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> login(User user) {
		// TODO Auto-generated method stub
		return userDAO.login(user);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userDAO.save(user);
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDAO.update(user);
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDAO.delete(user);
		
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userDAO.findById(id);
	}
	//ËÑË÷
	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return userDAO.findByName(name);
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	

}
