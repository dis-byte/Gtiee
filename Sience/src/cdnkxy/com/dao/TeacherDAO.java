package cdnkxy.com.dao;

import java.util.List;

import cdnkxy.com.entity.Teacher;





public interface TeacherDAO {
	
	//保存
	public void save(Teacher teacher);
	//修改
	public void update(Teacher teacher);
	//删除
	public void delete(Teacher teacher);
	//根据ID查找
	public Teacher findById(int id);
	//name搜索
	public Teacher findByName(String name);
	//查询所有
	public List<Teacher> findAll();
}
