package models;

public class Main {
	public static void main(String[] args) {
		Cat a[] = new Cat [100];
		a[0] = new Cat();
		a[1] = new Cat("Meo meo", 4, "Trawngs");
		
		for (int i = 0; i <= 1; i++) 
			System.out.println(a[i]);
		
	}
}
