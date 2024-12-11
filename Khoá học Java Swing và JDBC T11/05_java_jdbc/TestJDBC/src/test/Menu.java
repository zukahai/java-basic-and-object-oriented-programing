package test;

import java.util.Scanner;

import models.Student;
import models.StudentManager;

public class Menu {
	
	public static int chooseMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("+------- Menu ---------+");
		System.out.println("| 1. Thêm sinh viên           ");
		System.out.println("| 2. In ra danh sách sinh viên");
		System.out.print("Nhập lựa chọn: ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		int choose;
		do {
			choose = chooseMenu();
			switch (choose) {
				case 1: {
					Student s = new Student();
					s.input();
					studentManager.create(s);
					break;
				}
				case 2: {
					studentManager.display();
					break;
				}
			}
			
		} while (choose != 0);
		System.out.println("Đã thoát");
		
	}

}
