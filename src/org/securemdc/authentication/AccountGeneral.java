package org.securemdc.authentication;

public class AccountGeneral {

	/*
	 * Account type id
	 */
	public static final String ACCOUNT_TYPE = "org.securemdc.authentication";
	
	/*
	 * Account Name
	 */
	
	public static final String ACOUNT_NAME = "SecureMDC";
	
	/*
	 * Auth token types
	 */
	
	public static final String AUTHTOKEN_TYPE_READ_ONLY = "Read only";
	public static final String AUTHTOKEN_TYPE_READ_ONLY_LABEL = "Read only access to an SecureMDC account";
	
	public static final String AUTHTOKEN_TYPE_FULL_ACCESS ="Full access";
	public static final String AUTHTOKEN_TYPE_FULL_ACCESS_LABEL = "Full access to a SecureMDC account";
	
	public static final ServerAuthenticate sServerAuthenticate = new ParseComServerAuthenticate();
}
