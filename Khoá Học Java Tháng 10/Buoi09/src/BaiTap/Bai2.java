package BaiTap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(1);
		} else {
			if (ch >= 'a' && ch <= 'z') {
				System.out.println(2);
			} else {
				if (ch >= '0' && ch <= '9')
					System.out.println(3);
				else
					System.out.println(4);
			}
		}
	}

}
