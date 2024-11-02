package models;

public class Game {
	private int id;
	private Player player1;
	private Player player2;
	
	public Game() {
		this.id = 0;
		this.player1 = new Player();
		this.player2 = new Player();
	}

	public Game(int id, Player player1, Player player2) {
		this.id = id;
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public Player getWinner() {
		if (player1.isWinner() == true)
			return player1;
		if (player2.isWinner() == true) 
			return player2;
		return null;
	}
	
	public void resetGame() {
		player1.setScore(0);
		player2.setScore(0);
	}
	
	public void swapPlayers() {
		Player t = player1;
		player1 = player2;
		player2 = t;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", \nplayer1=" + player1 + ", \nplayer2=" + player2 + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
}
