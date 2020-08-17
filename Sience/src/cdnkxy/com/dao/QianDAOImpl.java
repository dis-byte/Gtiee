package cdnkxy.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cdnkxy.com.entity.Qian;

public class QianDAOImpl implements QianDAO {
	SessionFactory sessionFactory;
	private SessionFactory sessionFatory;
	
	public SessionFactory getSessionFatory() {
		return sessionFatory;
	}

	public void setSessionFatory(SessionFactory sessionFatory) {
		this.sessionFatory = sessionFatory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Qian qian) {
		// 保存(添加)
		Session session=sessionFactory.getCurrentSession();
		session.save(qian);
	}

	@Override
	public void update(Qian qian) {
		// 修改
		Session session=sessionFactory.getCurrentSession();
		session.update(qian);
	}

	@Override
	public void delete(Qian qian) {
		// 删除
		Session session=sessionFactory.getCurrentSession();
		session.delete(qian);
	}

	@Override
	public Qian findById(int id) {
		// 通过id查找
		Session session=sessionFactory.getCurrentSession();
		String hql="from Qian q where id=?";		
		Query query=session.createQuery(hql);
		query.setParameter(0, id);
		List<Qian> qlist=query.list();
		Qian qian=qlist.get(0);
		return qian;
	}

	@Override
	public List<Qian> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Qian q";
		Query query=session.createQuery(hql);
		List<Qian> qlist=query.list();
		return qlist;
	}

	@Override
	public Qian findByName(String name) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Qian q where name=?";		
		Query query=session.createQuery(hql);
		query.setParameter(0, name);
		List<Qian> qlist=query.list();
		Qian qian=qlist.get(0);
		return qian;
	}

	@Override
	public List<?> excuteQueryByPage(String hql, int pageNow, int PageSize) {
		// TODO Auto-generated method stub
		Query query= this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(pageNow);
		query.setMaxResults(PageSize);
		List<?> list=query.list();
		return list;
	}

	@Override
	public int getAllRowCount(String hql) {
		// TODO Auto-generated method stub
		Query queryObject = this.sessionFactory.getCurrentSession().createQuery(hql);
		Object obj = queryObject.uniqueResult();
		int totalCount=Integer.parseInt(obj.toString());
		return totalCount;
	}

}
