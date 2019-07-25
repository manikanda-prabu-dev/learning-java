package com.javatraining;

public class Constructor {
	private String myName;
	public Constructor(String name) {
		myName = name;
	}
	public String getMyName() {
		return myName;
	}
	public void output() {
		System.out.println("My name getting through instance methods:"+" "+ getMyName());
	}
}
