package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.dao.TeacherDAO;
import cdnkxy.com.entity.Teacher;

public class TeacherServiceImpl implements TeacherService {
	TeacherDAO teacherDAO;
	
	public TeacherDAO getTeacherDAO() {
		return teacherDAO;
	}

	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}

	@Override
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDAO.save(teacher);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDAO.update(teacher);
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDAO.delete(teacher);
	}

	@Override
	public Teacher findTeacherById(int id) {
		// TODO Auto-generated method stub
		return teacherDAO.findById(id);
	}

	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return teacherDAO.findAll();
	}

	@Override
	public Teacher findTeacherByName(String name) {
		// TODO Auto-generated method stub
		return teacherDAO.findByName(name);
	}

}
