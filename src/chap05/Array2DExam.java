package chap05;

public class Array2DExam {
	
	
	public static void main(String[] args) {
		
		int[][] myarr = new int[3][3];
		
		
		myarr[0][0] = 100;
		myarr[1][1] = 200;
		myarr[2][2] = 300;
		
		
		for(int i = 0; i<3; i++ ) {
			for(int j=0; j<3; j++) {
				
				System.out.print(myarr[i][j] + "\t");
			
				
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
