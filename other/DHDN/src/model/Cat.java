package model;

public class Cat extends Animal {
	private String breed;

	public Cat() {
		super();
		this.breed = "";
	}

	public Cat(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Cat [name=" + super.getAge() + ", age=" + super.getAge() + ", breed=" + breed + "]";
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
