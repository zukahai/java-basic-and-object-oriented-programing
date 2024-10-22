package BaiTap;

import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		// Tim max
		int max = a[0]; // so lon nhat
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		// Tim so lan xuat hien cua max
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == max) {
				dem++;
			}
		}
		
		System.out.println(max + " " + dem);
		
	}

}
