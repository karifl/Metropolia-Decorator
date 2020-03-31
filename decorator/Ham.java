package decorator;

public class Ham extends Stuffing{

	
	public Ham(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddHam();
	}
	
	public void AddHam() {
		System.out.println("Thin slices of ham added.");
	}
	
	public double getPrice() {
		double price = 2.00;
		
		return super.getPrice() + price;
	}
	
}
