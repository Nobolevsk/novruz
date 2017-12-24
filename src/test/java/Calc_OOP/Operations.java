package Calc_OOP;

import java.util.Scanner;

/**
 * Created by Новруз on 19.12.2017.
 */
public class Operations extends Value {

	public Operations(int firstNumber, int secondNumber) {
		super(firstNumber, secondNumber);
	}

	public static void plus (){
		int a = Value.firstNumber();
		int b = Value.secondNumber();
		int c = a+b;
		System.out.println("Result is: " + c);
	}
	public static void minus(){
		int a = Value.firstNumber();
		int b = Value.secondNumber();
		int c = a-b;
		System.out.println("Result is: " + c);
	}
	public static void div(){
		int a = Value.firstNumber();
		int b = Value.secondNumber();
		int c = a/b;
		System.out.println("Result is: " + c);
	}
	public static void multipl(){
		int a = Value.firstNumber();
		int b = Value.secondNumber();
		int c = a*b;
		System.out.println("Result is: " + c);
	}

}
