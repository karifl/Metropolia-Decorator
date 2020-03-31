package decorator;

public class TomatoSauce extends Stuffing{

	public TomatoSauce(Pizza pizzaMeal) {
		super(pizzaMeal);
		// TODO Auto-generated constructor stub
	}
	
	public void pile() {
		super.pile();
		AddTomatoSauce();
	}
	
	public void AddTomatoSauce() {
		System.out.println("Tomatosauce spread evenly on the dough.");
	}
	
	public double getPrice() {
		double price = 2.00;
		
		return super.getPrice() + price;
	}
	

}
