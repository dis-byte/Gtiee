package cdnkxy.com.action;

import java.util.List;

import cdnkxy.com.entity.Shenbao;
import cdnkxy.com.service.ShenbaoService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShenbaoAction extends ActionSupport{
	Shenbao shenbao;
	int id;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Shenbao getShenbao() {
		return shenbao;
	}
	public void setShenbao(Shenbao shenbao) {
		this.shenbao = shenbao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ShenbaoService getShenbaoService() {
		return shenbaoService;
	}
	public void setShenbaoService(ShenbaoService shenbaoService) {
		this.shenbaoService = shenbaoService;
	}
	ShenbaoService shenbaoService;

	//申报保存
	public String doAdd(){
		shenbaoService.saveShenbao(shenbao);
		return "add";
	}
	//修改申报
	public String doUpdate(){
		shenbaoService.updateShenbao(shenbao);
		return "update";
	}
	//删除申报
	public String doDelete(){
		Shenbao shenbao=shenbaoService.findShenbaoById(id);
		shenbaoService.deleteShenbao(shenbao);
		return "delete";
	}
	//查找单个申报
	public String doFind(){	
	Shenbao s=shenbaoService.findShenbaoById(id);
	//将申报放入值栈
	ActionContext ac=ActionContext.getContext();
	ac.put("s",s);
	return "find";
	}
	//name查找单个申报
		public String doFindName(){	
		Shenbao sh=shenbaoService.findShenbaoByName(name);
		//将申报放入值栈
		ActionContext ac=ActionContext.getContext();
		ac.put("sh",sh);
		return "findName";
		}
	//查找所有申报
	public String doFindAll(){
		List<Shenbao> shenbaos=shenbaoService.findAll();
		ActionContext ac=ActionContext.getContext();
		ac.put("all", shenbaos);
		return "findAll";
	}
	//显示申报信息来修改
	public String initUpdate(){
		Shenbao shenbao=shenbaoService.findShenbaoById(id);
		ActionContext ac=ActionContext.getContext();
		ac.put("update",shenbao);
		return "init";
	}
	
}
