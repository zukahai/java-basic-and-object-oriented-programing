package LyThuyet;

import java.util.Scanner;

public class CotCuoiCung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); // so hang
		int n = sc.nextInt(); // so cot
		
		int a[][] = new int[m][n]; // C++: int a[m][n]
		
		for (int i = 0; i < m; i++) { // chi so hang
			for (int j = 0; j < n; j++) { // chi so cot
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			System.out.println(a[i][1]);
		}
			
	}

}
