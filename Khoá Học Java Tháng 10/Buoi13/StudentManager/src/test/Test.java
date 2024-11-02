package test;

import models.Student;
import models.StudentBA;
import models.StudentIT;

public class Test {
	public static void main(String[] args) {
		StudentIT sIT = new StudentIT("23IT234", "Mạnh", "22-2-2002", "23IT", 9, 10);
		System.out.println(sIT.toString());
//		System.out.println(sIT);
		
//		StudentBA sBA = new StudentBA();
//		sBA.haha();
	}
}
