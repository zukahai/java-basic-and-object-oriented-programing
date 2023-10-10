package model;

public class Dog extends Animal{
	private String color;
	
	public Dog() {
		super();
		this.color = "";
	}
	
	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [name=" + super.getName() + ", age=" + super.getAge() + ", color=" + color + "]";
	}
}
