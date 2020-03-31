package decorator;

public class Pineapple extends Stuffing {
	
	
	public Pineapple(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddPineapple();
	}
	
	public void AddPineapple() {
		System.out.println("Diced pineapple added.");
	}
	
	public double getPrice() {
		double price = 2.00;
		
		return super.getPrice() + price;
	}
	
}
