package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("Hải", 25, 180));
		students.add(new Student("Nam", 20, 190));
		students.add(new Student("Hùng", 21, 160));
		students.add(new Student("Hoàng", 22, 165));
		students.add(new Student("Long", 23, 170));
		students.add(new Student("Linh", 18, 170));
		
		// Sắp xếp tăng dần theo tuổi
		// ... o1 .... o2 ...
		// hàm compare trả về 1 loại trả trị
		// > 0: mong muốn đổi chỗ
		// <= 0: giữ nguyên
		
		// Tăng dần theo tuổi, tuổi của đối tượng trước < tuổi của đối tượng sau
//		Collections.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				if (o1.getAge() > o2.getAge())
//					return 1; // đổi chỗ
//				else
//					return -1; // không đổi chỗ
//					
//			}
//		});
		
		// giảm dần theo chiều cao
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if (o1.getHeight() < o2.getHeight())
					return 10;
				else 
					return -10;
			}
		});
		
		for (int i = 0; i < students.size(); i++)
			System.out.println(students.get(i));
		

	}
}
