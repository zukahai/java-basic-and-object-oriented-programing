package BaiTap;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			tong += i;
		}
		System.out.println(tong);
	}

}
