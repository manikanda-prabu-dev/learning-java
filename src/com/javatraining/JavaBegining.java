package com.javatraining;

import java.util.Scanner;

public class JavaBegining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("hi mani program compiled");
//		strings();
//		variables();
//		scanner();
//		usingScanner();
//		usingScannerString();
//		usingScannerInteger();
//		operators();
//		incrementOperator();
//		decrementOperator();
//		ifCondition();
//		logicalOperators();
//		switchCase();
	//	whileLoop();
	//	nestedIf();
		//elseIf();
		conditionalOperator();
	}
	public static void strings() {
		
	}
	public static void variables() {
		double value;
		value = 6.63;
		System.out.println("double values are");
		System.out.print(value);
		
	}
	public static void scanner() {
		Scanner input = new Scanner(System.in);
		System.out.println(input.nextLine());
	}
	public static void usingScanner() {
		Scanner input = new Scanner(System.in);
		System.out.println(input.nextLine());
		double fNum,sNum,answer;
		System.out.println("enter fNum");
		fNum = input.nextDouble();
		System.out.println("enter sNum");
		sNum = input.nextDouble();
	    answer = fNum + sNum;
	    System.out.print("answer is:" + answer);
	}
	public static void usingScannerString() {
		Scanner input = new Scanner(System.in);
		String name,email;
		System.out.println("enter name");
		name = input.next();
		System.out.println("name is:"+name);
		System.out.println("enter email ID");
		email = input.next();
		System.out.println("email is:"+email);
		System.out.println(name +"-->"+email);
	}
	public static void usingScannerInteger() {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		System.out.println("enter number1");
		num1 = input.nextInt();
		System.out.println("number one is:"+num1);
		System.out.println("enter number2");
		num2 = input.nextInt();
		System.out.println("number one is:"+num2);
		System.out.println("Answer:" + (num1*num2));
	}
	public static void operators() {
		int a =5;
		int b = 10;
		a += 6;
		b *= 2;
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void incrementOperator() {
		int num1 = 10;
		System.out.println("normal value before increment:"+" "+num1);
		System.out.println("pre-increment"+" "+ ++num1);
		System.out.println("post-increment"+" "+num1++); 
	}
	public static void decrementOperator() {
		int num1 = 10;
		System.out.println("normal value before decrement:"+" "+num1);
		System.out.println("pre-decrement"+" "+ --num1);
		System.out.println("post-decrement"+" "+num1--); 
	}
	public static void ifCondition() {
		int num = 5;
		String name = "mani";
		if(num == 5) {
			System.out.println("yes its true");
		}else {
			System.out.println("else condition false");
		}
		if(name.equals("mani")) {
			System.out.println("srings are equal");
		}else {
			System.out.println("else condition false");
		}
	}
	public static void logicalOperators() {
		int boy = 22;
		int girl = 40;
		if(boy > 18 && girl < 41) {
			System.out.println("you are elegible to vote");
		}else {
			System.out.println("not eligible to vote");
		}
		
		if(boy > 18 || girl > 41) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("not eligible to vote");
		}
	}
	public static void switchCase() {
		int age;
		age = 3;
		switch(age) {
		case 1: System.out.println("you are baby");
		break;
		case 2 : System.out.println("you are 2 years old");
		break;
		case 3 : System.out.println("you are 3 years old");
		break;
		case 4 : System.out.println("you are 4 years old");
		break;
		default: System.out.println("don't know your age");
		break;	
		}
	}
	public static void whileLoop() {
		int loop = 0;
		while(loop <=10) {
			System.out.println(loop);
			loop++;	
		}
	}
public static void nestedIf() {
		int age = 17;
		if(age>18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("you are not elegible");
			if(age<15) {
				System.out.println("you are still kid");
			}else {
				System.out.println("you are grown up age should be above 18");
			}
		}
	}
public static void elseIf(){
	int age = 55;
	if(age>60)
		System.out.println("you are senior citizen");
	else if(age>=50)
		System.out.println("you are in 50's stage");
	else
		System.out.println("you are not in any of this conditions");
}
public static void conditionalOperator() {
	int age = 61;
	System.out.println(age>60?"you are senior citizen":"you are not an senior citizen");
	System.out.println(age>60?"you are senior citizen":"you are not an senior citizen");
}
}
