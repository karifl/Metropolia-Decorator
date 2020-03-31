package decorator;

public class Tuna extends Stuffing {

	
	public Tuna(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddTuna();
	}
	
	public void AddTuna() {
		System.out.println("Mashed tuna added.");
	}
	
	public double getPrice() {
		double price = 2.00;
		
		return super.getPrice() + price;
	}
	

}
