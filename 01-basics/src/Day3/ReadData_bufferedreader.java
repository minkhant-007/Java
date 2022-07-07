package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData_bufferedreader {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Name:");
		String name = reader.readLine();
		System.out.print("Enter Salary:");
		int salary = Integer.parseInt(reader.readLine());
		System.out.println("Enter Bonus:");
		float bouns = Float.parseFloat(reader.readLine());
		reader.close();
		System.out.println("-------Your Data--------");
		System.out.println("Name is " + name);
		System.out.println("Salary is " + salary);
		System.out.println("Bonus is " + bouns);
	}
}
