package com.aibees.kiosk.user.customer.model.vo;

public class CustomerVO {
	private String id;
	private String pwd;
	private String name;
	private String role;
	private String createDate;
	
	public CustomerVO() {
		// TODO Auto-generated constructor stub
	}

	public CustomerVO(String id, String pwd, String name, String role, String createDate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.role = role;
		this.createDate = createDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", role=" + role + ", createDate="
				+ createDate + "]";
	}
}
