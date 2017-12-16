package Task2;

/**
 * Created by Новруз on 16.12.2017.
 */
public class Mass20 {
	public static void main(String[] args) {
		int[] mass = new int[20];

		int max = 0;
		int min = 0;
		for (int i = 0; i < mass.length; i++) {
			mass[i] = -10 + (int) (Math.random() * (11 - (-10)));
			if (mass[i] > max)
				max = mass[i];
			if (mass[i] < min)
				min = mass[i];
		}
		System.out.println("Минимально положительный элемент массива: " + max +
				"\nМаксимально минимальный элемент массива: " + min);

		int maxmin = max;
		max = min;
		min = max;
		System.out.println("\n↓↓↓После обмена значениями получаем↓↓↓\n" +
				"Минимально положительный элемент массива: " + max +
				"\nМаксимально минимальный элемент массива: " + min);
	}
}
