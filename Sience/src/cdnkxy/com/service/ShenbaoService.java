package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.entity.Shenbao;

/*
 * 业务逻辑层
 * 和dao层相对应
 */
public interface ShenbaoService {
	public void saveShenbao(Shenbao shenbao);
	public void updateShenbao(Shenbao shenbao);
	public void deleteShenbao(Shenbao shenbao);
	public Shenbao findShenbaoById(int id);
	public Shenbao findShenbaoByName(String name);
	public List<Shenbao> findAll();
}
