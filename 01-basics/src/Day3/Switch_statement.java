package Day3;

import java.util.Locale.Category;
import java.util.Scanner;

import javax.swing.text.DefaultTextUI;
import javax.xml.catalog.Catalog;

public class Switch_statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Food Name :");
		String name = sc.nextLine();
		String category;
		switch (name) {
			case "burger","pizza","sandwich":
				category = "Fast Food";
				break;
			case "yogurt","milk tea":
				category = "Dessert";
				break;
			case "mohinga":
				category = "Burmese Food";
				break;
			case "Sushi":
				category = "Japanese Food";
				break;
			default:
				category = "Unknown!";
		
		}
		System.out.println(name + " is "+ category);
		sc.close();
	}
}
