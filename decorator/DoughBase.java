package decorator;

public class DoughBase implements Pizza {


	@Override
	public void pile() {
		// TODO Auto-generated method stub
		AddDoughBase();		
	}
	
	public void AddDoughBase() {
		System.out.println("Dough base assembled.");
	}

	@Override
	public double getPrice() {
		double price = 2.00;
		// TODO Auto-generated method stub
		return price;
	}
	

}
