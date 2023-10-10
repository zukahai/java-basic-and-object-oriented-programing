package model;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animals[] = new Animal[100];
		animals[0] = new Cat("c", 4, "Đực");
		animals[1] = new Dog("b", 1, "Trắng");
		animals[2] = new Dog("b", 1, "Đen");
		animals[3] = new DogBlack();
		
		for (int i = 0; i < 4; i++)
			System.out.println(animals[i]);
	}

}
