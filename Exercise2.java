package program;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Number of columns: ");
		int col = sc.nextInt();
		
		System.out.println();
		
		int mat[][] = new int[rows][col];
		
		for (int r=0; r<mat.length; r++) {
			for (int c=0; c<mat[r].length; c++) {
				mat[r][c] = sc.nextInt();
			}
		}
		
		System.out.print("Select a number: ");
		
		int x = sc.nextInt();
		
		for (int r=0; r<mat.length; r++) {
			for (int c=0; c<mat[r].length; c++) {
				if (mat[r][c]==x) {
					System.out.printf("Position: %d, %d", r,c);
					System.out.println();
					
					if (c > 0) {
						System.out.println("Left: " + mat[r][c-1]);
					}
					
					if (c < mat[r].length-1) {
						System.out.println("Right: " + mat[r][c+1]);
					}
					
					if (r > 0) {
						System.out.println("Up: " + mat[r-1][c]);
					}
					
					if (r < mat.length-1) {
						System.out.println("Down: " + mat[r+1][c]);
					}
					
					System.out.println();
				}
			}
		}
		
		sc.close();
	}

}
