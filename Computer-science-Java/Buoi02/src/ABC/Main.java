package ABC;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void sayHi() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int [4][5];
		Arrays.fill(a, 10);
		
		for (int x[]: a) {
			for (int i: x)
				System.out.print(i +" ");
			System.out.println();
		}
		
	}

}
