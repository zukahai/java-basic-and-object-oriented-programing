package BaiTap;

import java.util.Scanner;

public class Bai9 {
	// Giai lao den 21h05

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int dem = 0; // dem so luong so 10
		for (int i = 0; i < n; i++) {
			if (a[i] == 10) {
				dem = dem + 1;
			}
		}
		System.out.println(dem);
	}

}
