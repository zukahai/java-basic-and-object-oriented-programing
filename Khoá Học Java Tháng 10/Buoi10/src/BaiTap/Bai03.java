package BaiTap;

import java.util.Scanner;

public class Bai03 {
	
	public static int gcd(int a, int b) {
		do { 
			if(a > b) 
				a = a - b;
			else
				b = b - a;
		}
		while(a != b);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(gcd(a, b));
		System.out.println(gcd(a, c));
		System.out.println(gcd(b, c));
		System.out.println(gcd(a + b, a + c));
	}

}
