package BaiTap;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine(); 
		char ch; 
		long sum = 0; 
		for (int i = 0  ; i < str.length(); i++){
		     ch = str.charAt(i); 
		     
		     if (ch >= '0' && ch <= '9'){
		         sum += ch - 48; 
		     }
		}
		
		System.out.println(sum);
	}

}
