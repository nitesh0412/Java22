package com.aurionpro.test;

import com.aurionpro.model.ClassifyPlayer;
import com.aurionpro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player[] players = {
				new Player(1, "Nitesh1", 200, 100000,50),
				new Player(2, "Nit2", 55, 3500,0),
				new Player(3, "Nit3", 190, 6000,2),
				new Player(4, "NIt4", 30, 2000, 40),
				new Player(5, "Nit5", 100, 1500,200)

		};

		ClassifyPlayer obj = new ClassifyPlayer();

		Player[] aListers = obj.getAListers(players);
		printPlayers(aListers); 

		Player[] bListers = obj.getBListers(players);
		printPlayers(bListers); 
	}

	private static void printPlayers(Player[] players) {
		for (Player p : players) {
			System.out.println(p);
		}
	}
}
