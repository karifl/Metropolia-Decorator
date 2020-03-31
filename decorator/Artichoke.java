package decorator;

public class Artichoke extends Stuffing {

	public Artichoke(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddArtichoke();
	}
	
	public void AddArtichoke() {
		System.out.println("Artichokes added.");
	}
	
	public double getPrice() {
		double price = 1.00;
		
		return super.getPrice() + price;
	}
	

}
