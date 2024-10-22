package BaiTap;

import java.util.Scanner;

public class Bai13 {

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
		
		int max3 = -999999999;
		for (int i = 0; i < n; i++) {
			if (a[i] != max && a[i] != max2) {
				if (a[i] > max3) {
					max3 = a[i];
				}
			}
		}
		
		if (max3 == -999999999) {
			System.out.println("No third largest element");
		} else {
			System.out.println(max3);
		}
	}

}
