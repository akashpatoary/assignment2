package GusserGameProject;

import java.util.Scanner;

public class Umpire {
	int guessNumFromGuesser;
	int guessNumFromPlayer1;
	int guessNumFromPlayer2;
	int guessNumFromPlayer3;

	public void getGuessNumFromGusser() {
		Gusser gusser = new Gusser();
		guessNumFromGuesser = gusser.getGuessNumber();

	}

	public void getGuessNumFromPlayer() {
		Player p1 = new Player();
		guessNumFromPlayer1 = p1.getGuessNumber(1);
		Player p2 = new Player();
		guessNumFromPlayer2 = p2.getGuessNumber(2);
		Player p3 = new Player();
		guessNumFromPlayer3 = p3.getGuessNumber(3);

	}

	public void getWinner() {
		if (guessNumFromGuesser == guessNumFromPlayer1)
			if (guessNumFromGuesser == guessNumFromPlayer2 && guessNumFromGuesser == guessNumFromPlayer3) {
				System.out.println(" The winner is Player 1,2,3");
			} else if (guessNumFromGuesser == guessNumFromPlayer2) {
				System.out.println("The winner is Player 1,2");
			} else if (guessNumFromGuesser == guessNumFromPlayer3) {
				System.out.println("The winner is Player 1,3");
			} else {
				System.out.println("The winner is Player 1.");
			}
		else if (guessNumFromGuesser == guessNumFromPlayer2)
			if (guessNumFromGuesser == guessNumFromPlayer3) {
				System.out.println("The winner is Player 2,3");
			} else {
				System.out.println("The winner is Player 2.");
			}

		else if (guessNumFromGuesser == guessNumFromPlayer3) {
			System.out.println("The winner is Player 3.");
		} else
			System.out.println("all players lost the game.Please try again!");
	}
}
