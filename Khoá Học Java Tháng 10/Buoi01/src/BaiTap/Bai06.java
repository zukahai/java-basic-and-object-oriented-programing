package BaiTap;

import java.util.Scanner;

public class Bai06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Phan nguyen cua "+ a + " / " + b + " la " + (a / b));
		System.out.println("Phan du cua " + a + " / " + b + " la " + (a % b));
		System.out.println("Trung binh cong cua " + a + " va " + b + " la " + ((float)(a + b) / 2));
	}

}
