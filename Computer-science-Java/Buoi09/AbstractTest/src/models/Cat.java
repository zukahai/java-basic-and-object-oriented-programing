package models;

import interfaces.ITest;
import interfaces.IterfaceTest;

public class Cat extends Animal implements IterfaceTest, ITest{
	
	public Cat() {
		super();
	}
	
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void move() {
		System.out.println("Con mèo đang nhảy");
	}

	@Override
	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("Meo meo");
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abcd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}
}
