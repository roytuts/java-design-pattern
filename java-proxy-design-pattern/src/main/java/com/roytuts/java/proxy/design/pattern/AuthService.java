package com.roytuts.java.proxy.design.pattern;

public class AuthService {

	private boolean authenticated;

	public AuthService(final boolean authenticated) {
		this.authenticated = authenticated;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

}