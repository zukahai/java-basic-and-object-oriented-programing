package test;

import models.Student;
import models.StudentBA;
import models.StudentIT;

public class Test {
	public static void main(String[] args) {
		Student students[] = new Student[100];
		students[0] = new StudentIT("18It123", "Hai", 26, 10, 9);
		students[1] = new StudentBA();
		students[2] = new StudentIT("18It123", "Hung", 26, 10, 10);
		
		for (int i = 0; i < 3; i++) {
			if (students[i] instanceof StudentIT) {
				StudentIT temp = (StudentIT) students[i];
				System.out.println(temp.getScoreJava());
			}
		}
		
//		Object s = new StudentIT("18It123", "Hai", 26, 10, 9);
//		System.out.println(s);
		
	}
}
