package com.sapient.endur.service;

/**
 * 
 * @author Admin
 * We can use built-in FI, BiPredicate<U,V> instead of creating user-defined FI
 */
@FunctionalInterface
public interface Credential {
	public abstract boolean isValidCredentials(String userid, String password);
}

