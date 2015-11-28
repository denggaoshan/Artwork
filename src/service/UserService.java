package service;

import entity.User;

public interface UserService {
	
	public void register(String username,String password,String Nickname);
	public void login(String username,String password);
	
}
