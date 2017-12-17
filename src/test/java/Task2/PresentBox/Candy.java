package Task2.PresentBox;

/**
 * Created by Новруз on 17.12.2017.
 */
public class Candy extends Box {
	private String taste;

	public Candy(String name, double weight, int sum, String taste) {
		super(name, weight, sum);
		this.taste = taste;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Candy part → " + super.toString() + "| Taste with " + taste;
	}
}
