import java.util.Scanner;

/**
 * Created by Новруз on 03.12.2017.
 * @author Новруз
 */
public class Calculate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Print the first number");
		double a = scanner.nextDouble();
		System.out.println("Print the second number");
		double b = scanner.nextDouble();
		System.out.println("Print the third number");
		double c = scanner.nextDouble();

		System.out.println("What the operation do you want to do (+,-,*,/)?");
		String d = scanner.next();

		double e = a + b + c;
		if (d.equals("+"))
			System.out.printf("Your sum result is: %.4f", e);

		double f = a - b - c;
		if (d.equals("-"))
			System.out.printf("Your minus result is: %.4f", f);

		double g = a * b * c;
		if (d.equals("*"))
			System.out.printf("Your multipl. result is: %.4f", g);

		double k = a / b / c;
		if (d.equals("/"))
			System.out.printf("Your div result is: %.4f", k);


		scanner.close();
	}
}
