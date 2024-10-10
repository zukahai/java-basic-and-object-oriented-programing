package BaiTap;

import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int gt = 1;
		for (int i = 1; i <= n; i++) {
			gt *= i;
			System.out.print(i);
			if (i != n) {
				System.out.print(" * ");
			}
		}
		System.out.print(" = ");
		System.out.println(gt);
		
	}

}
