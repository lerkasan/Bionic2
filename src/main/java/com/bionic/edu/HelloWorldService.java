package com.bionic.edu;

public class HelloWorldService implements GreetingService {
	private String message;
	private int repeat = 1;

	public HelloWorldService() {
		message = "";
	}

	public HelloWorldService(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void sendGreeting() {
		for (int i = 0; i < repeat; i++){
		     System.out.println("Hello, world! " + message);
	          }
	}

	public int getRepeat() {
		return repeat;
	}

	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}
}