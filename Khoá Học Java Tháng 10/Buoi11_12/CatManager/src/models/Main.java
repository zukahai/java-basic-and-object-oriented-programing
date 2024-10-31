package models;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat a[] = new Cat[10];
		a[0] = new Cat("Meo Meo", 10, "xanh");
		a[1] = new Cat("Mạnh");
		a[2] = new Cat("Sinh", 19);
		a[3] = new Cat("Thịnh", 19);
		a[4] = new Cat();
		
		for (int i = 0; i <= 4; i++) {
			System.out.println(a[i]);
		}
		
	}

}
