package models;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {
		this.name = "";
		this.age = 0;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void move();
	public abstract void voice();
	public abstract int sum(int a, int b);

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
