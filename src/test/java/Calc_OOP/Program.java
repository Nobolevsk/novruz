package Calc_OOP;

import java.util.Scanner;

/**
 * Created by Новруз on 20.12.2017.
 */
public class Program extends Operations {
	public Program(int firstNumber, int secondNumber) {
		super(firstNumber, secondNumber);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, choose the operation: \n+ \n- \n/ \n*");
		String next = sc.next();
		if (next.equals("+"))
			Operations.plus();
		else if (next.equals("-"))
			Operations.minus();
		else if (next.equals("/"))
			Operations.div();
		else if (next.equals("*"))
			Operations.multipl();
		else
			System.err.println("Please, choose the valid operation");

	}

}
