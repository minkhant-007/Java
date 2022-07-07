package Day3;

import java.util.Scanner;

public class Switch_Expression {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Enter food name:");
		var name = sc.nextLine();
		
//		var category = 
//				switch(name) {
//					case "buger","Pizza","sandwish" -> "FastFood";
//					case "milk tea","yogurt" -> "Dessert";
//					case "Mohinga" -> "Burmese Food";
//					case "sushi" -> "Japanse Food";
//					default -> "Unknown!";
//				};
		var category = 
				switch(name) {
					case "buger","pizza","sandwish" -> {
						if(name.equals("pizza"))
							System.out.print( name +" is italian food");
						yield "Fast Food";
					}
					case "milk tea" -> {
						yield "Dresset";
					}
					case "Mohinga" -> "Burmese Food";
					case "sushi" -> "Japanes Food";
					default -> "Unknown!";
				};
		System.out.println(name + " is " + category);
	}
}
