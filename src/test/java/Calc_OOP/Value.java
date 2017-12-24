package Calc_OOP;

import java.util.Scanner;

/**
 * Created by Новруз on 19.12.2017.
 */
public class Value {
	private int firstNumber;
	private int secondNumber;

	public Value(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public static int firstNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, print the first number ");
		return scanner.nextInt();
	}
	public static int secondNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, print the second number ");
		return scanner.nextInt();
	}
}
