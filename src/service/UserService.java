package service;

import java.util.List;

import entity.User;

public interface UserService {
	
	public void register(String username,String password,String Nickname,String ip);
	public void login(String username,String password);
	
	public List<User> getAllArtists();
}
