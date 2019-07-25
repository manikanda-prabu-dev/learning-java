package com.javatraining;

public class Dog {
public static void fucntion() {
	System.out.println("dog barks");
}
public static void function(String name) {
	System.out.println("my name is:"+" "+name);
}

//Many methods and instance....................................
private String myName;

public void setMyName(String myName) {
	this.myName = myName;
}
public String getMyName() {
	return myName;
}
public void output() {
	System.out.println("My name getting through instance methods:"+" "+ getMyName());
}

}
