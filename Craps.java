package TextbookProblems;
//mport java.util.*;
//import java.lang.*;

public class Craps {
	public static void main(String[] args) {
		//craps dice game
		/*
		You rolled 3 + 2 = 5
		point is 5
		You rolled 2 + 5 = 7
		You lose
		*/
		
		int total;
		int roll1;
		int roll2;
		//boolean game = true;
		int counter = 0;
		int wins = 0;
		
		while(counter < 10000) {
			
			roll1 = rollDice();
			roll2 = rollDice();
			total = roll1 + roll2;
			//System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + total);
			
			if(total == 7 | total == 11) {
				//System.out.println("You win");
				wins++;
				counter++;
				//break;
			} else {
				//System.out.println("point is " + total);
				int roll3 = rollDice();
				int roll4 = rollDice();
				int total2 = roll3 + roll4;
				//System.out.println("You rolled " + roll3 + " + " + roll4 + " = " + total2);
				
				if(total==total2) {
					//System.out.println("You win");
					wins++;
					counter++;
					//game = false;
				} else {
					//System.out.println("You lose");
					counter++;
					//game = false;
				}
				
				
			}
			
		}
		System.out.println("from 10,000 games there are " + wins + " wins");
		
		
	}
	
	public static int rollDice() {
		int num = (int)(Math.random()*6)+ 1;
		return num;
	}
}
