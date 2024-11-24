package models;

public abstract class Animal {
	private String name;
	
	public Animal() {
		name = "";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void hello() {
		System.out.println("Hello");
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void diChuyen();
	public abstract int abc();
	
}
