package com.aibees.kiosk.user.customer.model.vo;

public class CustomerDTO {
	private String id;
	private String pwd;
	
	public CustomerDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerDTO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
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

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", pwd=" + pwd + "]";
	}
}
