package IceCream;

public class IceCreamDemo {

	public static void main(String[] args) {

		
		IceCream myIce = new IceCream(001, "Mint", 3, 2);
		IceCream yourIce = new IceCream(002, "Chocolate", 2, 1);
	
		myIce.addTopping("cherries");
		myIce.addTopping("chocolate chips");
		
		yourIce.addTopping("Hazelnuts");
		myIce.addTopping("sprinkles");
		
		printIce(myIce);
		printIce(yourIce);
		
	}// end main


	public static void printIce(IceCream icecream) {
		System.out.println("=======================");
		System.out.println("Order Number: " + icecream.getOrderNumber());
		System.out.println("");
		System.out.println(icecream.getName());
		System.out.println("Cost: £" + icecream.getCost());
		System.out.println("Toppings: " );
		icecream.printToppings();
		System.out.println("=======================");
		System.out.println("");
				
	}

}// EOF
