package entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import utils.Utils;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable 
{

	// Fields

	private String guid;
	private Role role;
	private String account;
	private String password;
	private String avatar;
	private String nickName;
	private Short age;
	private Boolean sex;
	private String phone;
	private String mailbox;
	private Boolean isCheckedMailbox;
	private String identity;
	private String weiBo;
	private Double balance;
	private Boolean isDisable;
	private String lastLoginIp;
	private Timestamp lastLoginTime;
	private Boolean isOnline;
	private Timestamp registerTime;
	private Set systemlogs = new HashSet(0);
	private Set storesForAuditGuid = new HashSet(0);
	private Set storesForOwnerGuid = new HashSet(0);
	private Set advertorialsesForAuditGuid = new HashSet(0);
	private Set commodities = new HashSet(0);
	private Set orderses = new HashSet(0);
	private Set notificationsesForFromGuid = new HashSet(0);
	private Set advertorialsesForAuthorGuid = new HashSet(0);
	private Set auctions = new HashSet(0);
	private Set notificationsesForToGuid = new HashSet(0);
	private Set userlogs = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String guid, Role role, String account, String password,
			String avatar, String nickName, Double balance, Boolean isDisable,
			String lastLoginIp, Timestamp lastLoginTime, Boolean isOnline,
			Timestamp registerTime) {
		this.guid = guid;
		this.role = role;
		this.account = account;
		this.password = password;
		this.avatar = avatar;
		this.nickName = nickName;
		this.balance = balance;
		this.isDisable = isDisable;
		this.lastLoginIp = lastLoginIp;
		this.lastLoginTime = lastLoginTime;
		this.isOnline = isOnline;
		this.registerTime = registerTime;
	}

	/** full constructor */
	public User(String guid, Role role, String account, String password,
			String avatar, String nickName, Short age, Boolean sex,
			String phone, String mailbox, Boolean isCheckedMailbox,
			String identity, String weiBo, Double balance, Boolean isDisable,
			String lastLoginIp, Timestamp lastLoginTime, Boolean isOnline,
			Timestamp registerTime, Set systemlogs, Set storesForAuditGuid,
			Set storesForOwnerGuid, Set advertorialsesForAuditGuid,
			Set commodities, Set orderses, Set notificationsesForFromGuid,
			Set advertorialsesForAuthorGuid, Set auctions,
			Set notificationsesForToGuid, Set userlogs) 
	{
		this.guid = guid;
		this.role = role;
		this.account = account;
		this.password = password;
		this.avatar = avatar;
		this.nickName = nickName;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.mailbox = mailbox;
		this.isCheckedMailbox = isCheckedMailbox;
		this.identity = identity;
		this.weiBo = weiBo;
		this.balance = balance;
		this.isDisable = isDisable;
		this.lastLoginIp = lastLoginIp;
		this.lastLoginTime = lastLoginTime;
		this.isOnline = isOnline;
		this.registerTime = registerTime;
		this.systemlogs = systemlogs;
		this.storesForAuditGuid = storesForAuditGuid;
		this.storesForOwnerGuid = storesForOwnerGuid;
		this.advertorialsesForAuditGuid = advertorialsesForAuditGuid;
		this.commodities = commodities;
		this.orderses = orderses;
		this.notificationsesForFromGuid = notificationsesForFromGuid;
		this.advertorialsesForAuthorGuid = advertorialsesForAuthorGuid;
		this.auctions = auctions;
		this.notificationsesForToGuid = notificationsesForToGuid;
		this.userlogs = userlogs;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Short getAge() {
		return this.age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMailbox() {
		return this.mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public Boolean getIsCheckedMailbox() {
		return this.isCheckedMailbox;
	}

	public void setIsCheckedMailbox(Boolean isCheckedMailbox) {
		this.isCheckedMailbox = isCheckedMailbox;
	}

	public String getIdentity() {
		return this.identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getWeiBo() {
		return this.weiBo;
	}

	public void setWeiBo(String weiBo) {
		this.weiBo = weiBo;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Boolean getIsDisable() {
		return this.isDisable;
	}

	public void setIsDisable(Boolean isDisable) {
		this.isDisable = isDisable;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Boolean getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	public Timestamp getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}

	public Set getSystemlogs() {
		return this.systemlogs;
	}

	public void setSystemlogs(Set systemlogs) {
		this.systemlogs = systemlogs;
	}

	public Set getStoresForAuditGuid() {
		return this.storesForAuditGuid;
	}

	public void setStoresForAuditGuid(Set storesForAuditGuid) {
		this.storesForAuditGuid = storesForAuditGuid;
	}

	public Set getStoresForOwnerGuid() {
		return this.storesForOwnerGuid;
	}

	public void setStoresForOwnerGuid(Set storesForOwnerGuid) {
		this.storesForOwnerGuid = storesForOwnerGuid;
	}

	public Set getAdvertorialsesForAuditGuid() {
		return this.advertorialsesForAuditGuid;
	}

	public void setAdvertorialsesForAuditGuid(Set advertorialsesForAuditGuid) {
		this.advertorialsesForAuditGuid = advertorialsesForAuditGuid;
	}

	public Set getCommodities() {
		return this.commodities;
	}

	public void setCommodities(Set commodities) {
		this.commodities = commodities;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getNotificationsesForFromGuid() {
		return this.notificationsesForFromGuid;
	}

	public void setNotificationsesForFromGuid(Set notificationsesForFromGuid) {
		this.notificationsesForFromGuid = notificationsesForFromGuid;
	}

	public Set getAdvertorialsesForAuthorGuid() {
		return this.advertorialsesForAuthorGuid;
	}

	public void setAdvertorialsesForAuthorGuid(Set advertorialsesForAuthorGuid) {
		this.advertorialsesForAuthorGuid = advertorialsesForAuthorGuid;
	}

	public Set getAuctions() {
		return this.auctions;
	}

	public void setAuctions(Set auctions) {
		this.auctions = auctions;
	}

	public Set getNotificationsesForToGuid() {
		return this.notificationsesForToGuid;
	}

	public void setNotificationsesForToGuid(Set notificationsesForToGuid) {
		this.notificationsesForToGuid = notificationsesForToGuid;
	}

	public Set getUserlogs() {
		return this.userlogs;
	}

	public void setUserlogs(Set userlogs) {
		this.userlogs = userlogs;
	}

}