package com.javatraining;
import java.util.Scanner;
public class Animal {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.next();
		Dog obj = new Dog();
		obj.fucntion();
		obj.function(name);
		obj.setMyName(name);
		
		
	}
}

//sample test
