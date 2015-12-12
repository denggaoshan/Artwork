package cn.edu.xmu.artwork.entity;

import java.io.Serializable;

//用户  + 买家
public class User implements Serializable
{
	 
	private String id;
	
	private String account;
	private String password;
	private String avatar;
	private String nickName;
	private Short age;
	private Boolean sex;
	private String phone;
	private String mailbox;
	
	private Boolean isCheckedMailbox;
	private String identityNumber;
	
	private Double balance; //余额
	
	private Boolean isDisable;
	
	public User()
	{}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getAccount() 
	{
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public Boolean getIsCheckedMailbox() {
		return isCheckedMailbox;
	}

	public void setIsCheckedMailbox(Boolean isCheckedMailbox) {
		this.isCheckedMailbox = isCheckedMailbox;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Boolean getIsDisable() {
		return isDisable;
	}

	public void setIsDisable(Boolean isDisable) {
		this.isDisable = isDisable;
	}

	
}
