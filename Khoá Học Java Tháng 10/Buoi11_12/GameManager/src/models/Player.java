package models;

public class Player {
	private String name;
	private int age;
	private int score;
	private int positionX;
	private int positionY;
	
	public Player() {
		this.name = "";
		this.age = 0;
		this.score = 0;
		this.positionX = 0;
		this.positionY = 0;
	}

	public Player(String name, int age, int score, int positionX, int positionY) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public void increaseScore() {
		this.score++;
	}
	
	public void decreaseScore() {
		this.score--;
	}
	
	public void increaseScore(int n) {
		this.score += n;
	}
	
	public void decreaseScore(int n) {
		this.score -= n;
	}
	
	public boolean isWinner() {
		if (this.score >= 100)
			return true;
		else
			return false;
	}
	

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", score=" + score + ", positionX=" + positionX
				+ ", positionY=" + positionY + "]";
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
}
