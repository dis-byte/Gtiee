package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.dao.QianDAO;
import cdnkxy.com.entity.Qian;

public class QianServiceImpl implements QianService {
	QianDAO qianDAO;
	
	public QianDAO getQianDAO() {
		return qianDAO;
	}

	public void setQianDAO(QianDAO qianDAO) {
		this.qianDAO = qianDAO;
	}

	@Override
	public void saveQian(Qian qian) {
		// TODO Auto-generated method stub
		qianDAO.save(qian);
	}

	@Override
	public void updateQian(Qian qian) {
		// TODO Auto-generated method stub
		qianDAO.update(qian);
	}

	@Override
	public void deleteQian(Qian qian) {
		// TODO Auto-generated method stub
		qianDAO.delete(qian);
	}

	@Override
	public Qian findQianById(int id) {
		// TODO Auto-generated method stub
		return qianDAO.findById(id);
	}

	@Override
	public List<Qian> findAll() {
		// TODO Auto-generated method stub
		return qianDAO.findAll();
	}

	@Override
	public Qian findQianByName(String name) {
		// TODO Auto-generated method stub
		return qianDAO.findByName(name);
	}

	@Override
	public List queryForPage(int pageSize, int currentPage) {
		// TODO Auto-generated method stub
		try{
			String hql = "from Qian";
			return qianDAO.excuteQueryByPage(hql, currentPage, pageSize);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Qian";
		return qianDAO.getAllRowCount(hql);
	}

}
