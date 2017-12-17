package Task2.PresentBox;

/**
 * Created by Новруз on 17.12.2017.
 */
public class Etc extends Box {
	private String size;

	public Etc(String name, double weight, int sum, String size) {
		super(name, weight, sum);
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Etc part → " + super.toString() + "| Size of other sweet-staffs '" + size + "'";
	}
}
