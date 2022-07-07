package Day3;

import java.util.Scanner;

public class ReadData_scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = sc.nextLine();
		System.out.print("Enter salary");
		Double salary = Double.parseDouble(sc.nextLine());
		System.out.print("Enter age");
		int age = sc.nextInt();// get integer 
		sc.close();
		System.out.println("-----Your Data-----");
		System.out.println("Name " + name);
		System.out.println("Salary " + salary);
		System.out.println ("Age " + age);
	}
}
