package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.dao.ChengguoDAO;
import cdnkxy.com.entity.Chengguo;

public class ChengguoServiceImpl implements ChengguoService {
	//ÉùÃ÷
	ChengguoDAO chengguoDAO;
	public ChengguoDAO getChengguoDAO() {
		return chengguoDAO;
	}

	public void setChengguoDAO(ChengguoDAO chengguoDAO) {
		this.chengguoDAO = chengguoDAO;
	}

	@Override
	public void saveChengguo(Chengguo chengguo) {
		// TODO Auto-generated method stub
		chengguoDAO.save(chengguo);
	}

	@Override
	public void updateChengguo(Chengguo chengguo) {
		// TODO Auto-generated method stub
		chengguoDAO.update(chengguo);
	}

	@Override
	public void deleteChegnguo(Chengguo chengguo) {
		// TODO Auto-generated method stub
		chengguoDAO.delete(chengguo);
	}

	@Override
	public Chengguo findChengguoById(int id) {
		// TODO Auto-generated method stub
		return chengguoDAO.findById(id);
	}

	@Override
	public List<Chengguo> findAll() {
		// TODO Auto-generated method stub
		return chengguoDAO.findAll();
	}
	//nameËÑË÷
	@Override
	public Chengguo findChengguoByName(String name) {
		// TODO Auto-generated method stub
		return chengguoDAO.findByName(name);
	}

}
