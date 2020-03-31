package decorator;

public abstract class Stuffing implements Pizza{
	protected Pizza pizzaMeal;

	public Stuffing(Pizza pizzaMeal) {
		this.pizzaMeal = pizzaMeal;
	}
	public void pile() {
		pizzaMeal.pile();
	}
	
	public double getPrice() {
		return pizzaMeal.getPrice();
	}
	
}


