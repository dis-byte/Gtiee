package cdnkxy.com.test;



import javassist.bytecode.Descriptor.Iterator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.Qian;
import cdnkxy.com.service.QianService;
/*
 * 测试Service的实现类
 */
public class QianTest {

//	@Test
//	public void testSaveQian() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		Qian qian=new Qian();
//		qian.setName("云技术开发的经费");
//		qian.setMoney(22423);
//		qianService.saveQian(qian);
//		System.out.println("保存ok");
//	}
	
	
	//hbm.xml配置和entity的数据类型匹配
//	@Test
//	public void testUpdateQian() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		Qian qian=new Qian();
//		qian.setId(1);
//		qian.setName("diss");
//		qian.setMoney(1223);
//		qianService.updateQian(qian);
//		System.out.println("更新ok");
//	}

//	@Test
//	public void testDeleteQian() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		Qian qian=new Qian();
//		qian.setId(2);
//		qian.setName("啊数据");
//		qian.setMoney(2342);
//		qianService.deleteQian(qian);
//		System.out.println("删除ok");
//	}

//	@Test
//	public void testFindQianById() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		
//		Qian qians=qianService.findQianById(3);
//		System.out.println("id="+qians.getId()+"\t名字="+qians.getName()+"\t经费="+qians.getMoney());
//		
//		
//	}

//	@Test
//	public void testFindAll() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		QianService qianService=(QianService) ctx.getBean("qianService");
//		List(Qian) qians=qianService.findAll();
//		Iterator ite=qians.iterator();
//		while(ite.hasNext()){
//			Qian qian=ite.next();
//			System.out.println("id="+qian.getId()+"\t名字="+qian.getName()+"\t经费="+qian.getMoney());
//		}
//	}

}
