package cdnkxy.com.dao;

import java.util.List;

import cdnkxy.com.entity.Chengguo;

public interface ChengguoDAO {
	public void save(Chengguo chengguo);
	public void update(Chengguo chengguo);
	public void delete(Chengguo chengguo);
	//根据id查询
	public Chengguo findById(int id);
	//name搜素
	public Chengguo findByName(String name);
	//查询所有
	public List<Chengguo> findAll();
}
