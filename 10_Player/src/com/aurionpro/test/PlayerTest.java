package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CountryType;
import com.aurionpro.model.Player;

public class PlayerTest {
	public static void main(String[] args) {
	
		Player[] player = new Player[12];
		player[0] = new Player("Nitesh",20,CountryType.india,1900,2,1);
		player[1] = new Player("yash",19,CountryType.india,1500,3,1);
		player[2] = new Player("aakash",26,CountryType.india,2000,3,2);
		player[3] = new Player("Sachine",32,CountryType.austrila,3800,3,1);
		player[4] = new Player("Amir",19,CountryType.pakistan,780,1,0);
		player[5] = new Player("Smith",35,CountryType.india,3278,40,3);
		player[6] = new Player("Dhoni",27,CountryType.englnad,4390,3,4);
		player[7] = new Player("Kohli",19,CountryType.englnad,4030,3,6);
		player[8] = new Player("sanju",19,CountryType.englnad,2900,3,2);
		player[9] = new Player("wade",19,CountryType.pakistan,7897,3,6);
		player[10] = new Player("starc",0,CountryType.englnad,10000,3,6);
		player[11] = new Player("pane",19,CountryType.india,4030,3,6);
		

		
		System.out.println("max runs"+findPlayerWithHighestRuns(player));
		System.out.println("max fifty"+findmaxfifty(player));
		System.out.println("youngest player" + youngestplayer(player));
	}
	
	CountryType[] country = CountryType.class.getEnumConstants();
	{	
		for(int i=0;i<country.length;i++)
		{
			
		}
		for(CountryType c:country) {
			System.out.println(c);
		}
		

	}
	
	
	private static Player youngestplayer(Player[] player)
	{
		Player min = player[0];
		for (int i = 0; i < player.length; i++) {
		if(min.getAge() > player[i].getAge())
		{
			min = player[i];
		}
		
	} return min ; 
}
	
	private static Player findPlayerWithHighestRuns(Player[] player) {
		Player maxPlayer = player[0];

		for (int i = 0; i < player.length; i++) {
			if (player[i].getRunsscored() > maxPlayer.getRunsscored()) {
				maxPlayer = player[i];
			}

		}
		return maxPlayer;
	}
	 
	private static Player findmaxfifty(Player[] player)
	{
		Player max = player[0];
		for(int i=0;i<player.length;i++)
		{
		if(max.getFifties() < player[i].getFifties())
		{
			max = player[i];
		}
	}
		return max ;
	 }
	
}
	
//	for(int i=0;i<12;i++)
//	{	Scanner sc = new Scanner(System.in) ;
//		Player[] player = new Player[i];
//		player[i].setName(sc.next());
//		
//	}
//}
//}


