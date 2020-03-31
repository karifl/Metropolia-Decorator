package decorator;

public class GratedCheese extends Stuffing {
	
	
	public GratedCheese(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddGratedCheese();
	}
	
	public void AddGratedCheese() {
		System.out.println("Grated cheese added on the top.");
	}
	
	public double getPrice() {
		double price = 2.00;
		 
		return super.getPrice() + price;
	}
	
}
