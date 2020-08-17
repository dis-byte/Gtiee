package cdnkxy.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cdnkxy.com.entity.User;
/*
 * 用户数据访问
 */
public class UserDAOImpl implements UserDAO {
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//用户登录
	@Override
	public List<User> login(User user) {
		Session session=sessionFactory.getCurrentSession();
		String hql="From User u where name=? and password=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, user.getName());
		query.setParameter(1,user.getPassword());
		List<User> ulist=query.list();
		return ulist;
		
	}
	
	//保存用户（注册用户）
	@Override
	public void save(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
	}
	@Override
	public void save2(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
	}
	
	//用户修改
	@Override
	public void update(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.update(user);
	}
	//用户删除
	@Override
	public void delete(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(user);
	}
	//根据id查所有用户
	@Override
	public User findById(int id) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User u where id=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,id);
		List<User> ulist=query.list();//结果集
		User user=ulist.get(0);
		return user;
	}
	//用户搜索
			@Override
			public User findByName(String name){
				Session session=sessionFactory.getCurrentSession();
				String hql="from User u where name=?";
				Query query=session.createQuery(hql);
				query.setParameter(0,name);
				List<User> ulist=query.list();//结果集
				User user=ulist.get(0);
				return user;
			}
	//查询所有用户
	@Override
	public List<User> findAll() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User u";
		Query query=session.createQuery(hql);
		List<User> ulist=query.list();
		return ulist;
		
	}


}
