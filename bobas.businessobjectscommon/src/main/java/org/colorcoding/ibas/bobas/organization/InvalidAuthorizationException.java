package org.colorcoding.ibas.bobas.organization;

public class InvalidAuthorizationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2013118631823755958L;

	public InvalidAuthorizationException() {
		super();
	}

	public InvalidAuthorizationException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public InvalidAuthorizationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidAuthorizationException(String arg0) {
		super(arg0);
	}

	public InvalidAuthorizationException(Throwable arg0) {
		super(arg0);
	}

}
