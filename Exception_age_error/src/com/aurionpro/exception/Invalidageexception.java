package com.aurionpro.exception;

public class Invalidageexception extends Exception  {
	
	private static final long serialVersionUID = 1L;
	String message ;
	
	public Invalidageexception(String message)
	{
		super(message);
	}
	
	@Override
	public String getMessage() {
		return this.getClass().getSimpleName()+" " +super.getMessage();
		}
	@Override
	public String toString() {
		return "InvalidAgeException [message=" + message + "]";
	}

}
