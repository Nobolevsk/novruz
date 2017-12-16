package Task2;

/**
 * Created by Новруз on 17.12.2017.
 */
public class Present {
	public static void main(String[] args) {
		Candy candy = new Candy("Sweet",1.3,200,"limon");
		Jellybean jellybean = new Jellybean("Lacky",3.2,800,"Japan");
		Etc etc = new Etc("Other",2,500,"Bigger");

		Box[] boxes = {candy,jellybean,etc};

		double weights = 0;
		int account = 0;
		for (Box someBox:
			 boxes) {
			System.out.println(someBox.toString());
			weights += someBox.getWeight();
			account += someBox.getSum();
		}
		System.out.println("\nОбщий вес подарка составляет: " + weights + " кг");
		System.out.println("Общая стоимость подарка составляет: " + account + " рублей");

	}

}
