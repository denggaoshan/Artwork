package cn.edu.xmu.artwork.service;

import java.util.List;

import cn.edu.xmu.artwork.entity.*;


public interface UserService 
{	
	public boolean register(String username,String password,String Nickname);
	
	public boolean login(String username,String password);
	
	public boolean userExists(String account);
	
	public List<Artist> getAllArtists();
}
