package cdnkxy.com.action;

import java.util.List;

import cdnkxy.com.entity.User;
import cdnkxy.com.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	User user;
	int id;//用户编号
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	UserService userService;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	//登录
	public String doLogin(){
		List<User> lists=userService.login(user);
		if(lists.size()>0){
			return "success";
		}else{
			return "fail";
		}
	}
	//用户添加
	public String doAdd(){
		userService.saveUser(user);
		return "add";
	}
	//用户注册
	public String rigister(){
		userService.saveUser(user);
		return "rigister";
	}
	//修改用户
	public String doUpdate(){
		userService.updateUser(user);
		return "update";
	}
	//删除用户
	public String doDelete(){
		//根据id查询用户
		User user=userService.findUserById(id);
		//删除用户
		userService.deleteUser(user);
		return "delete";
	}
	//Id查询单个用户
	public String doFind(){
		User u=userService.findUserById(id);
		//将用户放入值栈
		ActionContext ac=ActionContext.getContext();
		ac.put("u", u);
		return "find";
	}
	//name查询用户
	public String doFindName(){
		User ua = userService.findUserByName(name);
		ActionContext ac = ActionContext.getContext();
		ac.put("ua", ua);
		return "findName";
	}
	//select all user
	public String doFindAll(){
		List<User> users=userService.findAll();
		//将用户信息放入值栈
		ActionContext ac=ActionContext.getContext();
		ac.put("all", users);
		return "findAll";
	}
	//显示用户当前信息来修改
	public String initUpdate(){
		User user=userService.findUserById(id);
		ActionContext ac=ActionContext.getContext();
		ac.put("update", user);
		return "init";
	}
}
