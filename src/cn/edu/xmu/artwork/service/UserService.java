package cn.edu.xmu.artwork.service;

import java.util.List;

import cn.edu.xmu.artwork.entity.*;


public interface UserService 
{	
	public boolean register(String phone,String password,String Nickname);
	
	public boolean login(String phone,String password);
	
	public boolean userExists(String phone);
	
	public List<Artist> getAllArtists();
	
	public List<User> getAllUsers();
	
	public List<Editor> getAllEditors();
	
	public List<ChiefEditor> getAllChiefEditors();
}
