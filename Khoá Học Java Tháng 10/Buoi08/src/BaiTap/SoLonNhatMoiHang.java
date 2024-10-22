package BaiTap;

import java.util.Scanner;

public class SoLonNhatMoiHang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			int max = a[i][0];
			for (int j = 1; j < n; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
			System.out.println(max);
		}
	}

}
