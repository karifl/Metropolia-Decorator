package decorator;

public class Clam extends Stuffing{

	
	public Clam(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddClam();
	}
	
	public void AddClam() {
		System.out.println("pre-heated clams added.");
	}
	
	public double getPrice() {
		double price = 2.00;
		
		return super.getPrice() + price;
	}
	

}
