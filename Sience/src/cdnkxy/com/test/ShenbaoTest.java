package cdnkxy.com.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdnkxy.com.entity.Shenbao;
import cdnkxy.com.service.ShenbaoService;

public class ShenbaoTest {

//	@Test
//	public void testSaveShenbao() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
//		Shenbao shenbao=new Shenbao();
//		shenbao.setName("原子弹233");
//		shenbao.setMoney("123");
//		shenbaoService.saveShenbao(shenbao);
//		System.out.println("保存成功");
//	}

	@Test
	public void testUpdateShenbao() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
		Shenbao shenbao=new Shenbao();
		shenbao.setId(1);
		shenbao.setName("as");
		shenbao.setMoney("40");
		shenbaoService.updateShenbao(shenbao);
		System.out.println("更新成功");
	}

	@Test
	public void testDeleteShenbao() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
		Shenbao shenbao=new Shenbao();
		shenbao.setId(1);
		shenbao.setName("dis");
		shenbao.setMoney("123");
		System.out.println("删除ok");
	}

//	@Test
//	public void testFindShenbaoById() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
//		
//		Shenbao shenbaos=shenbaoService.findShenbaoById(1);
//		System.out.println("项目Id"+shenbaos.getId()+"\t项目名"+shenbaos.getName()+"\t项目经费"+shenbaos.getMoney());
//	}

//	@Test
//	public void testFindAll() {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ShenbaoService shenbaoService=(ShenbaoService) ctx.getBean("shenbaoService");
//		List<Shenbao> shenbaos=shenbaoService.findAll();
//		Iterator ite=shenbaos.iterator();
//		while(ite.hasNext()){
//			Shenbao shenbao=(Shenbao) ite.next();
//			System.out.println("项目Id"+shenbao.getId()+"\t项目名"+shenbao.getName()+"\t项目经费"+shenbao.getMoney());
//		}
//	}

}
