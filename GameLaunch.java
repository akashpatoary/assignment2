package GusserGameProject;

import java.util.Scanner;

public class GameLaunch {
public static void main(String[] args) {

	Umpire umpire = new Umpire();
	umpire.getGuessNumFromGusser();
	umpire.getGuessNumFromPlayer();
	umpire.getWinner();
	
}
}
