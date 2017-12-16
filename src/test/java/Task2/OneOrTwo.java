package Task2;

import Task1.Calculate;

import java.util.Scanner;

/**
 * Created by Новруз on 11.12.2017.
 */
public class OneOrTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите желаемую цифру для запуска одной из двух программ:\n" +
				" 1 - Калькулятор\n" +
				" 2 - Поиск самого длинного слова");
		int next = scanner.nextInt();

		if (next == 1){
			Calculate calculate = new Calculate();
			calculate.calc();}
		else if (next == 2){
			StringArray stringArray = new StringArray();
			stringArray.array();}
		else{
			System.out.println("Введите цифру 1 или 2");
		}
	}
}
