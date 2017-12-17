package Task2.PresentBox;

/**
 * Created by Новруз on 17.12.2017.
 */
public class Jellybean extends Box {
	private String country;

	public Jellybean(String name, double weight, int sum, String country) {
		super(name, weight, sum);
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Jellybean part → " + super.toString() + "| Jellybean from " + country;
	}
}
