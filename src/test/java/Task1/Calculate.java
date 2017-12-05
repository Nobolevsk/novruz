package Task1;

import java.util.Scanner;

/**
 * Created by Новруз on 03.12.2017.
 * @author Новруз
 */

public class Calculate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Print the first number"); //выводим первое значение
		double a = scanner.nextDouble();
		System.out.println("Print the second number"); //выводим второе значение
		double b = scanner.nextDouble();
		System.out.println("Print the third number"); //выводим третье значение
		double c = scanner.nextDouble();

		System.out.println("What the operation do you want to do (+,-,*,/)?"); // выбираем какую из выбранных агрегаций хотим выполнить
		String d = scanner.next();

		/*Ниже выполняются операции в зависимости от выбранной выше агрегации*/

		if (d.equals("+")) {
			double e = a + b + c;
			System.out.printf("Your sum result is: %.4f", e);
		}
		else  if (d.equals("-")) {
			double f = a - b - c;
			System.out.printf("Your minus result is: %.4f", f);
		}
		else if (d.equals("*")) {
			double g = a * b * c;
			System.out.printf("Your multipl. result is: %.4f", g);
		}
		else if (d.equals("/")){
			double k = a / b / c;
			System.out.printf("Your div result is: %.4f", k);
		}
		else
			System.err.println("Please, print valid values!");

		scanner.close();
	}
}
