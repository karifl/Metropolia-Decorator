package decorator;

import java.util.Scanner;

public class Pizzeria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myChoice = new Scanner(System.in);
		
		Pizza Margherita = new GratedCheese(new TomatoSauce(new DoughBase()));
		Pizza Hawai = new GratedCheese(new Pineapple(new Ham(new TomatoSauce(new DoughBase()))));
		Pizza QuattroStagioni = new GratedCheese(new Olive(new Ham(new Basil(new Champion(new Artichoke(new TomatoSauce(new DoughBase())))))));
		Pizza Capricciosa =new GratedCheese(new Olive(new Ham(new Mozzarella(new Champion(new TomatoSauce(new DoughBase()))))));
		Pizza FruttiDiMare =new GratedCheese(new Tuna(new Clam(new Shrimp(new Champion(new TomatoSauce(new DoughBase()))))));
		
		int choice = 0;
		
		System.out.println("Welcome to Luigi's! ");
		System.out.println("----------------------- \n ");
		System.out.println("");
		
		System.out.println("Pizza Margherita: " + Margherita.getPrice());
		System.out.println("Pizza Hawai: " +Hawai.getPrice());
		System.out.println("Pizza Quattro Stagioni: " +QuattroStagioni.getPrice());
		System.out.println("Pizza Capricciosa: " +Capricciosa.getPrice());
		System.out.println("Pizza Frutti Di Mare: " + FruttiDiMare.getPrice());
		
		System.out.print("\n\nChoose your pizza: \n 1 - Pizza Margherita \n 2 - Pizza Hawai \n 3 - Pizza Quattro Stagioni \n 4 - Pizza Capricciosa \n 5 - Pizza Frutti Di Mare \n\n>>");
		choice = myChoice.nextInt();
		switch(choice) {
		case 1:
			System.out.println("\nPizza Margherita\n");
			Margherita.pile();
			break;
		
		case 2:
			System.out.println("\nPizza Hawai\n");
			Hawai.pile();
			break;
		
		case 3:
			System.out.println("\nPizza Quattro Stagioni\n");
			QuattroStagioni.pile();
			break;
		case 4:
			System.out.println("\nPizza Capricciosa\n");
			Capricciosa.pile();
			break;
		case 5:
			System.out.println("\nPizza Frutti Di Mare\n");
			FruttiDiMare.pile();
			break;
					
		default:
			System.out.println("Error");
			break;
		}	
		
		
	}

}
