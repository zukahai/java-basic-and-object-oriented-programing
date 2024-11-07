package models;

import interfaces.ITest;

public class StudentIT extends Student implements ITest{
	private float scoreCpp;
	private float scoreJava;
	
	public StudentIT() {
		super();
		this.scoreJava = 0;
		this.scoreCpp = 0;
	}
	
	public StudentIT(String maSv, String name, int age, float scoreJava, float scoreCpp) {
		super(maSv, name, age);
		this.scoreCpp = scoreCpp;
		this.scoreJava = scoreJava;
	}
	
	@Override
	public String toString() {
		return "StudentIT [maSv=" + super.getMaSv() + ", name=" + super.getName() + 
				", age=" + super.getAge() + ", scoreJava=" + scoreJava + ", scoreCpp=" + scoreCpp + "]"; 
	}
	
	@Override
	public float getAveScore() {
		return (scoreCpp + scoreJava) / 2;
	}

	@Override
	public void haha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float func2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void func3() {
		// TODO Auto-generated method stub
		
	}
	
	
}
