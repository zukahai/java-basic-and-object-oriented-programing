package BaiTap;

import java.util.Scanner;

public class Bai02 {
	
	public static int soLuongUoc(int n) {
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				dem ++;
			}
		}
		return dem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (soLuongUoc(a[i]) == 2) {
				dem++;
			}
		}
		
		System.out.println(dem);
	}

}
