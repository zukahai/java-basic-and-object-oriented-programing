package models;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int choose;
		do {
			System.out.println("Menu");
			System.out.println("1. Xem danh sách sách");
			System.out.println("2. Thêm sách");
			System.out.println("0. Thoát");
			System.out.print("Nhập lựa chọn của bạn: ");
			
			Scanner sc = new Scanner(System.in);
			choose = sc.nextInt();
			int choose2;
			
			switch (choose) {
			case 1: {
				System.out.println("Demo xem danh sách sách");
				break;
			}
			case 2:
				System.out.println("Chức năng nhập sách");
				System.out.println("1. Nhập sách cứng");
				System.out.println("2. Thêm sách điện tử");
				System.out.print("Nhập lựa chọn của bạn: ");
				choose2 = sc.nextInt();
				if (choose2 == 1) {
					System.out.println("Demo chức năng nhập sách cứng");
				} else {
					System.out.println("Demo chức năng nhập sách điện tử");
				}
				break;
				
			case 0:
				System.out.println("Thoát");
				break;
			}
		} while (choose != 0);
	}
}
/*
 * 
 * do {
 *	 In ra menu
	 Xử lí theo choose
 * while(choose != 0);
 * 
 * while: kiểm tra điều kiện trước xong mới thực hiện khối lệnh
 * do-while: thực hiện khối lệnh trước xong mới kiểm tra điều kiện
 * */
