package com.example.test.cts.demotest;

public class CTSbean {
	private String message;


	public CTSbean(String message) {
		this.message=message;
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CTSbean [message "+ message+"]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
