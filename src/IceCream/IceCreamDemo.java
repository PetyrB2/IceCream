package IceCream;

public class IceCreamDemo {

	public static void main(String[] args) {

		
		IceCream myIce = new IceCream("Mint", 3, 2);
		IceCream yourIce = new IceCream("Chocolate", 2, 1);
	
		myIce.addTopping("cherries");
		myIce.addTopping("chocolate chips");
		
		yourIce.addTopping("Hazelnuts");
		myIce.addTopping("sprinkles");
		
		printIce(myIce);
		printIce(yourIce);
		
	}// end main


	public static void printIce(IceCream icecream) {
		System.out.println("Order:");
		System.out.println("=====");
		System.out.println(icecream.getName());
		System.out.println("Cost: £" + icecream.getCost());
		System.out.println("Toppings: " );
		icecream.printToppings();
		System.out.println("");
				
	}

}// EOF
