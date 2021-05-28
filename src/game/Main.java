package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import fixtures.Room;

public class Main {
	public static Scanner myScanner = new Scanner(System.in);
	public static RoomManager rm = new RoomManager(18);
	public static Player myPlayer = new Player();
	public static String[] directions = { "North", "East", "South", "West" };
	public static boolean isSolved = false;

	public static void main(String[] args) {
		rm.init();
		myPlayer.setCurrentRoom(rm.startingRoom);


		while (!myPlayer.hasWon) {
			printRoom(myPlayer);
			int index = 0;
			System.out.println("Your Options: ");
			for (Room el : myPlayer.currentRoom.getOptions()) {
				System.out.println(directions[index] + " -> " + el.getName());
				index++;
			}
			String[] cmd = collectInput();
			parse(cmd, myPlayer);
			System.out.println();
		}
	}

	public static void printRoom(Player player) {
		System.out.println(player.currentRoom);
	}

	public static String[] collectInput() {

		String input = myScanner.nextLine();
		String[] words = input.split(" ");
		return words;

	}

	private static void parse(String[] command, Player player) {
		String action = command[0];
		String objective = command[1];
		if (action.equals("open")) {
			if (objective.equals("book")) {
				if (player.getCurrentRoom().getBook() == null) {
					System.out.println("There is nothing  to open here.");
					return;
				}
				System.out.println("Inside the book it reads..." + player.getCurrentRoom().getBook());

				return;
			}

			else if (objective.equals("washer")) {
				if (player.getCurrentRoom().getName() == "LaundryRoom") {
					System.out.println("Please enter the code to open the washer");
					String attemptedCode = myScanner.nextLine();
					player.setHasWon(
							player.getCurrentRoom().openWasher(player.getCurrentRoom(), rm.currentCode, attemptedCode));
				}
				else 
					System.out.println("There is nothing to open here");
			}
			else 
				System.out.println("That is something you cannot even open");

		}

		else if (action.equals("go")) {
			Room nextMove = player.getCurrentRoom().getOption(objective);

			if (nextMove == null) {
				System.out.println("You cannot move in that direction");
				return;
			}
			player.setCurrentRoom(nextMove);

			if (objective == "quit") {
				isSolved = true;
				return;
			}
		} else {
			System.out.println("This is not a command please try again...");
		}
	}
}
