package entity;

public class User {
	
	private int id;
	private String username;
	private String password;
	
	private String nickname;
	
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	
	public String getNickname(){
		return nickname;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setId(int id){
		this.id =id;
	}
	
	public int getId(){
		return 1;
	}
	
}
