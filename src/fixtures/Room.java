package fixtures;

import java.util.Random;

public class Room extends Fixture implements Washer {
	Room[] options = new Room[4];
	Book book;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);

	}

	public Room(String name, String shortDescription, String longDescription, Book book) {
		super(name, shortDescription, longDescription);
		this.book = book;

	}

	public Room[] getOptions() {
		return this.options;
	}

	public Book getBook() {
		return this.book;
	}

	public String getCode() {
		return this.book.code;
	}

	public Room getOption(String direction) {

		switch (direction) {
		case "North":
			if (options[0].getName() == "Wall") {
				System.out.println("Please don't run into walls that hurts!");
				return null;
			}
			return options[0];

		case "East":
			if (options[1].getName() == "Wall") {
				System.out.println("Please don't run into walls that hurts!");
				return null;
			}
			return options[1];

		case "South":
			if (options[2].getName() == "Wall") {
				System.out.println("Please don't run into walls that hurts!");
				return null;
			}
			return options[2];

		case "West":
			if (options[3].getName() == "Wall") {
				System.out.println("Please don't run into walls, that hurts!");
				return null;
			}
			return options[3];

		}
		return null;

	}

	public void setOptions(Room options, int index) {
		this.options[index] = options;
	}

	@Override
	public String toString() {
		return name + "\n" + shortDescription + "\n" + longDescription + "\n";
	}

	@Override
	public boolean openWasher(Room room, String code, String attemptedCode) {

		if (room.getName() == "LaundryRoom") {
			if (code.equals(attemptedCode)) {
				System.out.println(
						"You have entered a 4th dimension...just like Mike Wazowski and Sullivan. Enjoy your journey.");
				System.out.println("Congrats you have escaped!");
				for (int i = 1; i <= 9; i++) {
					for (int j = 9; j > i; j--) {
						System.out.print(" ");
					}
					System.out.print("*");
					for (int k = 1; k < 2 * (i - 1); k++) {
						System.out.print(" ");
					}
					if (i == 1) {
						System.out.println("");
					} else {
						System.out.println("*");
					}
				}
				for (int i = 9 - 1; i >= 1; i--) {
					for (int j = 9; j > i; j--) {
						System.out.print(" ");
					}
					System.out.print("*");
					for (int k = 1; k < 2 * (i - 1); k++) {
						System.out.print(" ");
					}
					if (i == 1)
						System.out.println("");
					else
						System.out.println("*");
				}
				System.out.println("Congrats you have escaped!");
				return true;
			} else {
				System.out.println("Cmon that is incorrect... don't think you can escape with that code");
				return false;
			}
		} else {
			System.out.println("There is nothing to open here");
			return false;
		}

	}

}
