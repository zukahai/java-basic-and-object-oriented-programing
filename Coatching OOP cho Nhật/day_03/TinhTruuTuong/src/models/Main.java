package models;

public class Main {

	public static void main(String[] args) {
		
//		Animal a = new Fish();
//		a.hello();
		
		Animal a = new Fish("Vang", true);
		System.out.println(a);
	}
}

/*
 *Tạo ra abstract class Student gồm các thuộc tính
 *	name: String;
 * 	age: int;
 *Và gồm các phương thức:
 *	các phương thức khởi tạo
 *	các getter,setter, toString
 *	Phương thức trừu tương getAvgScore()
 *
 *Tạo ra class StudentIT kế thừa Student có thêm â thuộc tính 
	scoreCPP: float
	scoreJava: float
 *Và gồm các phương thức:
 *	các phương thức khởi tạo
 *	các getter,setter, toString
 *	Ghè đè lại getAvgScore()
 * 
 * 
 * 
 * 
 * 
 * */
