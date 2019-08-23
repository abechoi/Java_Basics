/*
	SWITCHES: ** Don't name java programs after java methods **
	1. Use Scanner object and nextInt() method to set int choice
	2. Handle choices that are outside of the range
*/

import java.util.Scanner;

public class switches{

	public static void main(String[] args){

		int choice;
		Scanner sc = new Scanner(System.in);
		
		printMenu();
		choice = sc.nextInt();

		while( choice != 4 ){

			switch( choice ){

				case 1:
					loadGame();
					break;
				case 2:
					playGame();
					break;
				case 3:
					multiplayer();
					break;
				default:
					error();
					break;
			}// END SWITCH

			printMenu();
			choice = sc.nextInt();
		}

		quit();

	}// END MAIN

	static void loadGame()
	{ System.out.println("Loading game..."); }

	static void playGame()
	{ System.out.println("Playing game..."); }

	static void multiplayer()
	{ System.out.println("Playing multiplayer..."); }

	static void quit()
	{ System.out.println("Quitting game..."); }

	static void error()
	{ System.out.println("Invalid input..."); }

	static void printMenu()
	{ 
		String menu;

		menu  = "\n--------------\n";
		menu += "     MENU     \n";
		menu += "--------------\n";
		menu += "1. Load\n";
		menu += "2. Play\n";
		menu += "3. Multiplayer\n";
		menu += "4. Quit\n";
		menu += "--------------\n";
		menu += "Enter choice: ";

		System.out.print(menu); }

}// END CLASS