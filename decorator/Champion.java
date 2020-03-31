package decorator;

public class Champion extends Stuffing {

	
	public Champion(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}

	public void pile() {
		super.pile();
		AddChampion();
	}
	
	public void AddChampion() {
		System.out.println("Sliced champions added.");
	}
	
	public double getPrice() {
		double price = 4.00;
		
		return super.getPrice() + price;
	}
}
