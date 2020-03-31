package decorator;

public class Mozzarella extends Stuffing{

	
	public Mozzarella(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddMozzarella();
	}
	
	public void AddMozzarella() {
		System.out.println("Thin-sliced Mozzarella-cheese added.");
	}
	
	public double getPrice() {
		double price = 2.00;
		
		return super.getPrice() + price;
	}
}
