package BaiTap;

import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = -999999999;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		int max2 = -999999999;
		for (int i = 0; i < n; i++) {
			if (a[i] != max) {
				if (a[i] > max2) {
					max2 = a[i];
				}
			}
		}
		System.out.println(max2);
	}

}
