package test;

import java.util.ArrayList;
import java.util.Scanner;

import models.Student;
import models.StudentBA;
import models.StudentIT;

public class Menu {
	
	public static int showMenu() {
		System.out.println("+-------------------------- Menu----------------------+");
		System.out.println("| 1. Thêm một sinh viên IT                            |");
		System.out.println("| 2. Thêm một sinh viên BA                            |");
		System.out.println("| 3. In ra danh sách sinh viên                        |");
		System.out.println("| 4. In ra những sinh viên IT có điểm C++ lớn hơn 5   |");
		System.out.println("| 5. In ra những sinh viên tên Hải                    |");
		System.out.println("| 0. Thoát                                            |");
		System.out.println("+-----------------------------------------------------+");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập lựa chọn của bạn: ");
		int choose = sc.nextInt();
		return choose;
	}

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		
		int choose; 
		do {
			choose = showMenu();
			
			switch (choose) {
			case 1:
				System.out.println("Nhập thông tin sinh viên IT:");
				StudentIT s = new StudentIT();
				s.input();
				students.add(s);
				break;
			case 2:
				System.out.println("Nhập thông tin sinh viên BA:");
				StudentBA p = new StudentBA();
				p.input();
				students.add(p);
				break;
			case 3:
				System.out.println("Danh sách sinh viên");
				
				for (int i = 0; i < students.size(); i++) {
					System.out.println(students.get(i));
				}
				break;
			case 4:
				System.out.println("Danh sách sinh viên IT có điểm C++ lớn hơn 5");
				
				for (int i = 0; i < students.size(); i++) {
					Student st = students.get(i);
					if (st instanceof StudentIT) {
						StudentIT sIt = (StudentIT) st;
						if (sIt.getScoreCPP() > 5) {
							System.out.println(sIt);
						}
					}
				}
				break;
			case 5:
				System.out.println("Danh sách sinh viên có tên là Hải");
				for (int i = 0; i < students.size(); i++) {
					Student st = students.get(i);
					if (st.getTen().equals("Hải")) {
						System.out.println(st);
					}
				}
				break;
			}
		} while (choose != 0);
		
		System.out.println("Cảm đã sử dụng hệ thống. Kết thúc chương trình");

	}

}
