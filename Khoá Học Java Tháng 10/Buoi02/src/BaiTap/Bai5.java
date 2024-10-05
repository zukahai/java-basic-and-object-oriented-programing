package BaiTap;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (100 <= n && n <= 999) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
