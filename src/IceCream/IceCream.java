package IceCream;

import java.util.ArrayList;

public class IceCream {

	// Atrributes
	private int orderNumber = 0;
	private String name;
	private int cost;
	private int numScoops;
	private ArrayList<String> toppings;


	public IceCream(int orderNumber, String name, int cost, int numScoops) {
		this.orderNumber = orderNumber;
		this.name = name;
		this.cost = cost;
		this.numScoops = numScoops;
		this.toppings = new ArrayList<>();
	}//end Ice


	public void addTopping(String topping) {
		toppings.add(topping);
	}


	public String getName() {
		return name;
	}


	public int getCost() {
		return cost;
	}



	public int getNumScoops() {
		return numScoops;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	


//	public ArrayList<String> getToppings() {
//		return toppings;
//	}

	public void printToppings() {
		for (String topping : toppings) {
			System.out.println("\t" + topping);
		}
	}

	
}// end main
