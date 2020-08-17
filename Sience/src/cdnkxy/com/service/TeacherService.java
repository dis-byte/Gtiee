package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.entity.Teacher;

/*
 * ÒµÎñÂß¼­²ã
 */
public interface TeacherService {
	public void saveTeacher(Teacher teacher);
	public void updateTeacher(Teacher teacher);
	public void deleteTeacher(Teacher teacher);
	public Teacher findTeacherById(int id);
	public Teacher findTeacherByName(String name);
	public List<Teacher> findAll();
}
