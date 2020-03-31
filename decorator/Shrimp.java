package decorator;

public class Shrimp extends Stuffing {

	
	public Shrimp(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddShrimp();
	}
	
	public void AddShrimp() {
		System.out.println("Shrimps added.");
	}
	
	public double getPrice() {
		double price = 2.00;
		
		return super.getPrice() + price;
	}
	

}
