package Task2;

import java.util.Arrays;

/**
 * Created by Новруз on 16.12.2017.
 */
public class Mass20 {
	public static void main(String[] args) {
		int[] mass = new int[20];

		int max = 10;
		int maxI = 0;
		int min = -10;
		int minI = 0;
		for (int i = 0; i < mass.length; i++) {
			mass[i] = -10 + (int) (Math.random() * (11 - (-10)));
			System.out.print(Arrays.asList(mass[i]));
			if (mass[i] <= max && mass[i] > 0) {
				max = mass[i];
				maxI = i;
			}
			int a = mass[i];
			if (mass[i] >= min && mass[i] < 0) {
				min = mass[i];
				minI = i;
			}
		}

		System.out.println("\nМинимально положительный элемент массива: " + max +
				"\nМаксимально минимальный элемент массива: " + min);

		System.out.println("\n↓↓↓После обмена индексами элементов результата получаем↓↓↓");
		mass[maxI] = min;
		mass[minI] = max;
		for (int i = 0; i < mass.length; i++) {
			System.out.print(Arrays.asList(mass[i]));
		}
	}
}