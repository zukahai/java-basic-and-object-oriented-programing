package test;

import models.Game;
import models.Player;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game g = new Game(123, new Player("Hải", 26, 0, 10, 10), new Player("Mạnh Đức", 19, 0, 10, 10));
		
		g.getPlayer2().setScore(100);
		g.getPlayer1().setScore(100);
		
		System.out.println(g.getWinner());
		
	}

}
