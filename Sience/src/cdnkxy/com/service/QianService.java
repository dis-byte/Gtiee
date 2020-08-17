package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.entity.Qian;
/*
 * 业务逻辑层
 * 和dao层相对应
 */
public interface QianService {
	public void saveQian(Qian qian);
	public void updateQian(Qian qian);
	public void deleteQian(Qian qian);
	public Qian findQianById(int id);
	public Qian findQianByName(String name);
	public List<Qian> findAll();
	//分页
	public List queryForPage(int pageSize,int currentPage);
	public int getRows();
}
