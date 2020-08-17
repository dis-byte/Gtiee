package cdnkxy.com.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.Chengguo;
import cdnkxy.com.service.ChengguoService;

public class ChengguoTest {

//	@Test
//	public void testSaveChengguo() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
//		Chengguo chengguo=new Chengguo();
//		chengguo.setName("豆数据");
//		chengguoService.saveChengguo(chengguo);
//		System.out.println("添加ok");
//	}

	@Test
	public void testUpdateChengguo() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
		Chengguo chengguo=new Chengguo();
		chengguo.setId(1);
		chengguo.setName("唯我独尊");
		System.out.println("更新ok");
	}

	@Test
	public void testDeleteChegnguo() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
		Chengguo chengguo=new Chengguo();
		chengguo.setId(1);
		chengguo.setName("唯我独尊");
		chengguoService.deleteChegnguo(chengguo);
		System.out.println("删除ok");
	}

//	@Test
//	public void testFindChengguoById() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
//		Chengguo chengguos=chengguoService.findChengguoById(1);
//		System.out.println("成果Id"+chengguos.getId()+"\t成果名"+chengguos.getName());
//	}
//
//	@Test
//	public void testFindAll() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ChengguoService chengguoService=(ChengguoService) ctx.getBean("chengguoService");
//		List<Chengguo> chengguos=chengguoService.findAll();
//		Iterator ite=chengguos.iterator();
//		while(ite.hasNext()){
//			Chengguo chengguo=(Chengguo) ite.next();
//			System.out.println("成果Id"+chengguo.getId()+"\t成果名"+chengguo.getName());
//		}
//	}

}
