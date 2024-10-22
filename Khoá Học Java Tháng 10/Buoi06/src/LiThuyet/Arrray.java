package LiThuyet;

import java.util.Scanner;

public class Arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		/*
		 * int: -2^31 den 2^31-1
		 * long: -2^63 den 2^63-1
		 * 
		 * */
		long tong = 0;
		for (int i = 0; i < n; i++) {
			tong += a[i];
		}
		System.out.println(tong);
		
	}

}
