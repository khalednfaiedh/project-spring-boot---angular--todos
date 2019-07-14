package com.hc.jee.auth;

public class AuthenticationBean {
	
	private String m;

	public AuthenticationBean(String m) {
		super();
		this.m = m;
	}

	public AuthenticationBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "AuthenticationBean [message=" + m + "]";
	}
	

}
