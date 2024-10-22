package BaiTap;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		long tong = 0;
		for (int i = 0; i < n; i++) {
			tong += a[i];
		}
		
		System.out.println(tong);
	}

}
