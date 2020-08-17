package cdnkxy.com.dao;

import java.util.List;

import cdnkxy.com.entity.Qian;

public interface QianDAO {
	public void save(Qian qian);
	public void update(Qian qian);
	public void delete(Qian qian);
	public Qian findById(int id);
	//name searching
	public Qian findByName(String name);
	public List<Qian> findAll();
	//·ÖÒ³
	public List<?> excuteQueryByPage(String hql,int pageNow,int PageSize);
	public int getAllRowCount(String hql);
}
