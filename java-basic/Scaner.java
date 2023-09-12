package basic;

import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập A: ");
		a = sc.nextInt();
		System.out.print("Nhập B: ");
		b = sc.nextInt();
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("A + B = " + (a + b));
		System.out.println("A - B = " + (a - b));
		System.out.println("A * B = " + (a * b));
		System.out.println("A / B = " + ((float)a / b));
	}

}
