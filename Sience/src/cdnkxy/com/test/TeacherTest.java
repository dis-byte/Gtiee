package cdnkxy.com.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.Teacher;
import cdnkxy.com.service.TeacherService;



public class TeacherTest {

//	@Test
//	public void testSaveTeacher() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
//		Teacher teacher =new Teacher();
//		teacher.setName("汤师爷的二大爷");
//		teacher.setGender("男");
//		teacher.setAddress("新华门西路地下一楼");
//		teacher.setTel("13378283838");
//		teacher.setPosition("科研指导老师");
//		teacher.setInfo("聪明的");
//		teacherService.saveTeacher(teacher);
//		System.out.println("保存成功");
//	}

//	@Test
//	public void testUpdateTeacher() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
//		Teacher teacher=new Teacher();
//		teacher.setId(1);
//		teacher.setName("唐老师");
//		teacher.setAddress("东方南路西一段");
//		teacherService.updateTeacher(teacher);
//		System.out.println("更新ok");
//		
//	}
//
//	@Test
//	public void testDeleteTeacher() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
//		Teacher teacher=new Teacher();
//		teacher.setId(1);
//		System.out.println("删除ok");
//	}

	@Test
	public void testFindTeacherById() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
		Teacher teachers=teacherService.findTeacherById(2);
		System.out.println("id"+teachers.getId()+"\t名字"+teachers.getName()+"\t性别"+teachers.getGender()+"\t住址"+teachers.getAddress()+"\t电话"+teachers.getTel()+"\t职位"+teachers.getPosition()+"\t信息"+teachers.getInfo());
		
	}

	@Test
	public void testFindAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
		List<Teacher> teachers=teacherService.findAll();
		Iterator ite=teachers.iterator();
		while(ite.hasNext()){
			Teacher teacher=(Teacher) ite.next();
			System.out.println("id"+teacher.getId()+"\t名字"+teacher.getName()+"\t性别"+teacher.getGender()+"\t住址"+teacher.getAddress()+"\t电话"+teacher.getTel()+"\t职位"+teacher.getPosition()+"\t信息"+teacher.getInfo());
			
		}
	}

}
