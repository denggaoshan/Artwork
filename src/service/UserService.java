package service;

import entity.User;

public interface UserService {
	
	public void register(User user);
	public void login(String username,String password);
	
}
