package decorator;

public class Olive extends Stuffing {


	public Olive(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddOlive();
	}
	
	public void AddOlive() {
		System.out.println("Sliced olives added.");
	}
	
	public double getPrice() {
		double price = 2.00;
		
		return super.getPrice() + price;
	}
	

}
