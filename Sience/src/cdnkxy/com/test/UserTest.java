package cdnkxy.com.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.User;
import cdnkxy.com.service.UserService;

public class UserTest {
	
	@Test
	public void testLogin() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setName("jack");
		user.setPassword("132");
		List<User> users=userService.login(user);
		if(users.isEmpty()){
			System.out.println("登录失败");
		}else{
			System.out.println("登录成功");
		}
	}

	@Test
	public void testSaveUser() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setName("jsps");
		user.setPassword("333");
		userService.saveUser(user);
		System.out.println("用户注册成功");
	}

	@Test
	public void testUpdateUser() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setId(4);
		user.setName("disa");
		user.setPassword("123");
		userService.updateUser(user);
		System.out.println("更新ok");
		
	}

	@Test
	public void testDeleteUser() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		User user=new User();
		user.setId(4);
		user.setName("disa");
		user.setPassword("123");
		userService.deleteUser(user);
		System.out.println("删除ok");
	}

	@Test
	public void testFindUserById() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		
		User users=userService.findUserById(1);
		System.out.println("用户Id"+users.getId()+"\t用户名"+users.getName()+"\t用户密码"+users.getPassword());
	}

	@Test
	public void testFindAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)ctx.getBean("userService");
		List<User> users=userService.findAll();
		Iterator ite=users.iterator();
		while(ite.hasNext()){
			User user=(User) ite.next();
			System.out.println("用户Id"+user.getId()+"\t用户名"+user.getName()+"\t用户密码"+user.getPassword());
		}
	}

}
