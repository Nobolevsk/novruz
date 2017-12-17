package Task2.PresentBox;

/**
 * Created by Новруз on 17.12.2017.
 */
public class Box {
	private String name;
	private double weight;
	private int sum;

	public Box(String name, double weight, int sum) {
		this.name = name;
		this.weight = weight;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "name is " + name + "| weight is " + weight + "| sum is " + sum;
	}
}
