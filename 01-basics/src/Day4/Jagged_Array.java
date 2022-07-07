package Day4;

import java.util.Arrays;

public class Jagged_Array {
	public static void main(String[] args) {
		int [][] datas= {
				{1,2,3},
				{1,2,3,4},
				{1,2}
			};
		System.out.println("for loop ----");
		for(var r = 0; r< datas.length; r++) {
			for( var c=0; c< datas[r].length; c++ ) {
				System.out.print(datas[r][c] + "\t");
			}System.out.println("");
		}
		System.out.println("----- for each -----");
		for(var row : datas) {
			for( var col : row)
				System.out.print(col + "\t");
				System.out.println();
		}
		
		System.out.println(Arrays.deepToString(datas));
		
	}
	
}
