package cdnkxy.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cdnkxy.com.entity.Shenbao;
/*
 * 
 * 申报数据访问
 */
public class ShenbaoDAOImpl implements ShenbaoDAO{
	//创建sessionFactory
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Shenbao shenbao) {
		// 申报信息保存
		Session session=sessionFactory.getCurrentSession();
		session.save(shenbao);
		
	}

	@Override
	public void update(Shenbao shenbao) {
		// 修改申报
		Session session=sessionFactory.getCurrentSession();
		session.update(shenbao);
		
	}

	@Override
	public void delete(Shenbao shenbao) {
		// 删除申报
		Session session=sessionFactory.getCurrentSession();
		session.delete(shenbao);
		
	}

	@Override
	public Shenbao findById(int id) {
		// 根据id查所有用户
		Session session=sessionFactory.getCurrentSession();
		String hql="from Shenbao s where id=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,id);
		List<Shenbao> slist=query.list();
		Shenbao shenbao=slist.get(0);
		return shenbao;
	}

	@Override
	public List<Shenbao> findAll() {
		// 查询所有用户
		Session session=sessionFactory.getCurrentSession();
		String hql="from Shenbao s";
		Query query=session.createQuery(hql);
		List<Shenbao> slist=query.list();
		return slist;
	}

	@Override
	public Shenbao findByName(String name) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Shenbao s where name=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,name);
		List<Shenbao> slist=query.list();
		Shenbao shenbao=slist.get(0);
		return shenbao;
	}

}
