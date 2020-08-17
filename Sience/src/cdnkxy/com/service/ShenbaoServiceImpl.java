package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.dao.ShenbaoDAO;
import cdnkxy.com.entity.Shenbao;

public class ShenbaoServiceImpl implements ShenbaoService {
	ShenbaoDAO shenbaoDAO;
	
	public ShenbaoDAO getShenbaoDAO() {
		return shenbaoDAO;
	}

	public void setShenbaoDAO(ShenbaoDAO shenbaoDAO) {
		this.shenbaoDAO = shenbaoDAO;
	}

	@Override
	public void saveShenbao(Shenbao shenbao) {
		// TODO Auto-generated method stub
		shenbaoDAO.save(shenbao);

	}

	@Override
	public void updateShenbao(Shenbao shenbao) {
		// TODO Auto-generated method stub
		shenbaoDAO.update(shenbao);

	}

	@Override
	public void deleteShenbao(Shenbao shenbao) {
		// TODO Auto-generated method stub
		shenbaoDAO.delete(shenbao);

	}

	@Override
	public Shenbao findShenbaoById(int id) {
		// TODO Auto-generated method stub
		return shenbaoDAO.findById(id);
	}

	@Override
	public List<Shenbao> findAll() {
		// TODO Auto-generated method stub
		return shenbaoDAO.findAll();
	}

	@Override
	public Shenbao findShenbaoByName(String name) {
		// TODO Auto-generated method stub
		return shenbaoDAO.findByName(name);
	}

}
