package BaiTap;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String y = sc.nextLine();
		
		String p = "";
		while (p.length() < y.length()) {
			p = p + x;
		}
		
		if (p.equals(y)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
