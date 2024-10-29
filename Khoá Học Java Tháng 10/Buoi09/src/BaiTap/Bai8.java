package BaiTap;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				System.out.print(s.charAt(i));
			} else {
				System.out.println();
			}
		}
	}
}
