package com.bootrestsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	@Column(name="id")
	private long id;
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="currentamt")
	private long currentAmt;
	
	@Column(name="balanceamt")
	private long BalanceAmt;
	
	@Column(name="withdraw")
	private long withdraw;

	public User() {
		id = 0;
	}

	public User(long id, String userName, String password,long curamt) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.currentAmt = curamt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getCurrentAmt() {
		return currentAmt;
	}

	public void setCurrentAmt(long currentAmt) {
		this.currentAmt = currentAmt;
	}

	public long getBalanceAmt() {
		return BalanceAmt;
	}

	public void setBalanceAmt(long balanceAmt) {
		BalanceAmt = balanceAmt;
	}

	public long getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(long withdraw) {
		this.withdraw = withdraw;
	}
}
