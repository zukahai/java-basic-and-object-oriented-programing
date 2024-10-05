package BaiTap;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
//		if (a == b) 
//			System.out.println(a + " = " + b);
//		else if (a > b)
//			System.out.println(a + " > " + b);
//		else
//			System.out.println(a + " < " + b);
// ----------------------------------------------------------
		if (a == b) {
			System.out.println(a + " = " + b);
		} else { // a > b hoac a < b
			if (a > b) {
				System.out.println(a + " > " + b);
			} else {
				System.out.println(a + " < " + b);
			}
		}
	}

}
