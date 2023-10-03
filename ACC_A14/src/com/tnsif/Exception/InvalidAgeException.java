package com.tnsif.Exception;

public class InvalidAgeException {

	String message;

	public InvalidAgeException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return " The age must be greater than 18";
	}


	}
