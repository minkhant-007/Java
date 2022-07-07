package Day4;

public class TwoD_Array {
	public static void main(String[] args) {
		int[][] marks = {
				{50,53,55,57,60},
				{70,72,74,78,82},
				{80,79,82,88,85}
		};
		String[] names = {"Jeno","Yuri","Cherry"};
		int row = marks.length;
		int col = marks[0].length;
		
		for(var i = 0; i<row ;i++) {
			var total = 0;
			for(var j = 0; j<col; j++) {
				total += marks[i][j];
			}
			System.out.println("Total mark obtained by" + names[i] + ":"+total + "marks");
			System.out.println("Average mark :" + (float)total/5 + "marks") ;
			System.out.println("--------------------");
		}
	}
}
