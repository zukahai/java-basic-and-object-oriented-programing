package VKU;

import java.util.Scanner;

public class Example  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		int index = 0;
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < index; j++)
				System.out.print(" ");
			for (int j = 0; j < n + 2 * (n - 1) - 2 * index; j++)
				System.out.print("*");
			System.out.println();
			index += (i < n - 1) ? 1 : -1;
		}	
	}
}