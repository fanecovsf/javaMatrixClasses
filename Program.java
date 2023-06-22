package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("---------------------");
		
		int count = 0;
		
		for (int r=0; r<mat.length; r++) {
			for (int c=0; c<mat[r].length; c++) {
				if (mat[r][c]<0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers: " + count);
		
		sc.close();
	}

}
