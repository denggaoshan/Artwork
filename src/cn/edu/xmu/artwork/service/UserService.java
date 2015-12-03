package cn.edu.xmu.artwork.service;

import java.util.List;

import cn.edu.xmu.artwork.entity.User;


public interface UserService 
{	
	public void register(String username,String password,String Nickname,String ip);
	
	public void login(String username,String password);
	
	public boolean userExists(String account);
	
	public boolean userExistsByGuid(String guid);
	
	public List<User> getAllArtists();
}
