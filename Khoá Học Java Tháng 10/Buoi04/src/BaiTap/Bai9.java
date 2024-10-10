package BaiTap;

import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				tong += i;
			}
		}
		
		System.out.println(tong);
	}

}
