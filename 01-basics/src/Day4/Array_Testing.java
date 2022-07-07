package Day4;

import java.util.Arrays;

public class Array_Testing {
	public static void main(String[] args) {
		int[]  arry = {100 ,50, 200, 40,90};
		
		System.out.println(arry[2]);
		changevalue(arry);
		System.out.println("After calling method:" + Arrays.toString(arry));
		
		Student s = new Student();
		s.rno = 20;
		System.out.println("Before rno:" + s.rno);
		changeRno(s);
		System.out.println("After rno:" + s.rno);
	}

	private static void changeRno(Student s1) {
		s1.rno = 1;
		
	}

	private static void changevalue(int[] data) {
		data[0] = 2000;
		
	}
}
class Student{
	int rno;
}
