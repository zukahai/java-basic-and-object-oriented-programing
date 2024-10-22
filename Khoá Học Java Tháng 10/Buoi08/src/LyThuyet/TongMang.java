package LyThuyet;

import java.util.Scanner;

public class TongMang {

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
		
		long tong = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				tong += a[i][j];
			}
		}
		
		System.out.println(tong);
	}

}
