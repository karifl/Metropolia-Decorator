package decorator;

public class Basil extends Stuffing {

	

	public Basil(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddBasil();
	}
	
	public void AddBasil() {
		System.out.println("Fresh basil added.");
	}
	
	public double getPrice() {
		double price = 1.00;
		
		return super.getPrice() + price;
	}
	

}
