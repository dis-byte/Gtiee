package cdnkxy.com.dao;

import java.util.List;

import cdnkxy.com.entity.User;

public interface UserDAO {
	//用户登录
	public List<User> login(User user);

	//用户注册
	public void save(User user);
	//添加用户
	public void save2(User user);
	//用户修改
	public void update(User user);
	//删除用户
	public void delete(User user);
	//根据ID查找用户
	public User findById(int id);
	//搜索
	public User findByName(String name);
	//查询所有用户
	public List<User> findAll();
}
