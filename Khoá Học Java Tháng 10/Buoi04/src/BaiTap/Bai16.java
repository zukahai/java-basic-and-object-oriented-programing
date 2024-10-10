package BaiTap;

import java.util.Scanner;

public class Bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			// In ra N dau *
			for (int j = 1; j <= i; j++) { // Lap lai i lan
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
