package cdnkxy.com.dao;

import java.util.List;

import cdnkxy.com.entity.Shenbao;

public interface ShenbaoDAO {
	//增删改查
	public void save(Shenbao shenbao);
	public void update(Shenbao shenbao);
	public void delete(Shenbao shenbao);
	//根据id查询 
	public Shenbao findById(int id);
	//
	public Shenbao findByName(String name);
	//查询所有申报
	public List<Shenbao> findAll();
}
