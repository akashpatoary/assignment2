package GusserGameProject;

import java.util.Scanner;

public class Player {
	int guessNumber;
	
	public int getGuessNumber(Integer playerNumber) {
		System.out.println("Hey player "+playerNumber+" ! please guess any number between 0 - 1000.");
		Scanner sc = new Scanner(System.in);
		int userFirstInputNum = sc.nextInt();
		if(userFirstInputNum>=1000 || userFirstInputNum<1)
			playerInputValidation(sc);
		else
		guessNumber=userFirstInputNum;		
		return guessNumber;
	}
	
	public void playerInputValidation(Scanner sc) {
		do {
			System.out.println("The inputed number is not within 1 - 1000.Please input any number between 1 - 1000.");		
			guessNumber=sc.nextInt();
		}
		while(guessNumber>=1000 || guessNumber<1);
	}
}
