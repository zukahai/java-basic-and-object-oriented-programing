package models;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Cat a[] = new Cat [2];
		a[0] = new Cat("Doraemon", 6, "Trawngs");
		a[1] = new Cat("Meo meo", 10, "Trawngs");
		
		for (int i = 0; i <= 1; i++) 
			System.out.println(a[i]);
		
		System.out.println("Sau khi sắp xếp");
		// o1 ... o2: 
		Arrays.sort(a, new Comparator<Cat>() {
			public int compare(Cat o1, Cat o2) { // trả về x > 0 nếu muốn đổi chỗ
				return o1.getSoChan() - o2.getSoChan();
			}
		});
		
		for (int i = 0; i <= 1; i++)
			System.out.println(a[i]);
		
		Scanner sc = new Scanner(System.in);
		
		
	}
}
