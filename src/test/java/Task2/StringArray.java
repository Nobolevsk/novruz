package Task2;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Новруз on 09.12.2017.
 * @author Новруз
 */
public class StringArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество строк для ввода: ");
		int sumstr = scanner.nextInt();
		String[] array = new String[sumstr];

		int max = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Введите %d слово: ", i + 1);
			String str = scanner.next();
			array[i] = str;
			if (str.length() > max)
				max = str.length();
			}
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() == max)
				System.out.println(array[i]);
		}
		}
		}