package Day2;

import java.util.Scanner;

public class constantvariable {
	static final float RATE = 2.5f;
	static final int MIN_RATE = 1000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Price :");
		int price = sc.nextInt();
		if(price < MIN_RATE) {
			price = MIN_RATE;
		}
		System.out.println("Price:" + price);
		System.out.println("\nExpense:" + (price * RATE));
		
	}
}
