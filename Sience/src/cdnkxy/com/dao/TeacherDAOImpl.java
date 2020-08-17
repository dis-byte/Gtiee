package cdnkxy.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cdnkxy.com.entity.Teacher;

public class TeacherDAOImpl implements TeacherDAO {
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void save(Teacher teacher) {
		//保存
		Session session=sessionFactory.getCurrentSession();
		session.save(teacher);

	}


	@Override
	public void update(Teacher teacher) {
		// 保存
		Session session=sessionFactory.getCurrentSession();
		session.update(teacher);

	}

	@Override
	public void delete(Teacher teacher) {
		// 删除
		Session session=sessionFactory.getCurrentSession();
		session.delete(teacher);

	}

	@Override
	public Teacher findById(int id) {
		// 根据id查所有
		Session session=sessionFactory.getCurrentSession();
		String hql="from Teacher t where id=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, id);
		List<Teacher> tlist=query.list();
		Teacher teacher=tlist.get(0);
		return teacher;
	}

	@Override
	public List<Teacher> findAll() {
		// 查询所有
		Session session=sessionFactory.getCurrentSession();
		String hql="from Teacher t";
		Query query=session.createQuery(hql);
		List<Teacher> tlist=query.list();
		return tlist;
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Teacher t where name=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, name);
		List<Teacher> tlist=query.list();
		Teacher teacher=tlist.get(0);
		return teacher;
	}

}
