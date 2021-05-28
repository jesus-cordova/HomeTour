package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import fixtures.Book;
import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] rooms;
	Random rand = new Random();
	String[] possibleCode = {"jdk", "jvm", "jre"};
	String currentCode = possibleCode[rand.nextInt(possibleCode.length)];
	Book turtles = new Book(" It's Always What was Done Last That Counts ", " This book is about many things... but yet very little at the same time. I don't mean to trick you but remember who you are and also don't forget about", currentCode);
	public RoomManager(int roomCount)
	{
		rooms = new Room[roomCount];
	}
	public void init()
	{
		Room livingroom = new Room("Living Room", "A small living room", "A relaxed place to hangout and enjoy the fire with some sunday night football");
		this.rooms[0] = livingroom;
		this.startingRoom = livingroom;
		Room kitchen = new Room("Kitchen", "A huge kitchen", "Many things you can do here... things like... idk... eat.");
		this.rooms[1] = kitchen;
		Room corridor3= new Room("Corridor 3", "This is just long passage way", "No art, no pictures, just straight emptiness..Hello darkness my old friend");
		this.rooms[2] = corridor3;
		Room wall = new Room("Wall", "Wall", "Wall");
		this.rooms[3] = wall;
		Room corridor1  = new Room("Corridor 1", "This is just long passage way", "No art, no pictures, just straight emptiness..Hello darkness my old friend");
		this.rooms[4] = corridor1;
		Room backdoor = new Room("Backdoor", "Backdoors are a great way to escape", "This backdoor is wide open, no need to open or close");
		this.rooms[6] = backdoor;
		Room backyard = new Room("Backyard ", "Everything is so green", "Clean cut grass where a book lies all by itself", turtles );
		this.rooms[7] = backyard;
		Room masterbedroom = new Room("MasterBedroom", "The dream bedroom", "A kid can only wish to sleep in a huge bed growing up");
		this.rooms[8] = masterbedroom;
		Room corridor2 = new Room("Corridor 2","This is just long passage way", "No art, no pictures, just straight emptiness..Hello darkness my old friend");
		this.rooms[9] = corridor2;
		Room office = new Room("Office", "Well orgnaized desks", "Trying to get some work done this is your spot");
		this.rooms[10] = office;
		Room bedroom = new Room("Bedroom", "Not a big bedroom", "This bedroom wishes it was bedroom");
		this.rooms[11] = bedroom;
		Room bathroom= new Room("Bathroom", "Handle your business", "Always place the toilet lid down when you are done");
		this.rooms[12] = bathroom;
		Room frontdoor= new Room("Frontdoor", "Another good way to escape", "This is locked and there is no way of escaping through here");
		this.rooms[13] = frontdoor;
		Room foyer = new Room("Foyer", "Nice and relax spot", "Sad thing is there is no furniture, empty again... Hello darkness my old friend");
		this.rooms[14] = foyer;
		Room corridor4 = new Room("Corridor4", "This is just long passage way", "No art, no pictures, just straight emptiness..Hello darkness my old friend");
		this.rooms[15] = corridor4;
		Room laundryroom = new Room("LaundryRoom", "Best way to get them fresh clothes", "There is only a washer, but it looks like it can be opened");
		this.rooms[16] = laundryroom;
		Room basement = new Room("Basement", "Not finished", "Why did you come in here");
		this.rooms[17] = basement;
		
		livingroom.setOptions(kitchen, 0);
		livingroom.setOptions(wall, 1);
		livingroom.setOptions(corridor3, 2);
		livingroom.setOptions(corridor1, 3);
		
		kitchen.setOptions(backdoor, 0);
		kitchen.setOptions(wall, 1);
		kitchen.setOptions(livingroom, 2);
		kitchen.setOptions(wall, 3);
		
		
		corridor3.setOptions(livingroom, 0);
		corridor3.setOptions(foyer, 1);
		corridor3.setOptions(frontdoor, 2);
		corridor3.setOptions(wall, 3);
		
		corridor1.setOptions(masterbedroom, 0);
		corridor1.setOptions(livingroom, 1);
		corridor1.setOptions(corridor2, 2);
		corridor1.setOptions(wall, 3);
		
		backdoor.setOptions(backyard, 0);
		backdoor.setOptions(wall, 1);
		backdoor.setOptions(kitchen, 2);
		backdoor.setOptions(wall, 3);
		
		masterbedroom.setOptions(wall, 0);
		masterbedroom.setOptions(wall, 1);
		masterbedroom.setOptions(corridor1, 2);
		masterbedroom.setOptions(wall, 3);
		
		corridor2.setOptions(corridor1, 0);
		corridor2.setOptions(office, 1);
		corridor2.setOptions(bedroom, 2);
		corridor2.setOptions(bathroom, 3);
		
		office.setOptions(wall, 0);
		office.setOptions(wall, 1);
		office.setOptions(wall, 2);
		office.setOptions(corridor2, 3);
		
		bedroom.setOptions(corridor2, 0);
		bedroom.setOptions(wall, 1);
		bedroom.setOptions(wall, 2);
		bedroom.setOptions(wall, 3);
		
		bathroom.setOptions(wall, 0);
		bathroom.setOptions(corridor2, 1);
		bathroom.setOptions(wall, 2);
		bathroom.setOptions(wall, 3);
		
		frontdoor.setOptions(corridor3, 0);
		frontdoor.setOptions(wall, 1);
		frontdoor.setOptions(wall, 2);
		frontdoor.setOptions(wall, 3);
		
		foyer.setOptions(corridor4, 0);
		foyer.setOptions(wall, 1);
		foyer.setOptions(wall , 2);
		foyer.setOptions(corridor3, 3);
		
		corridor4.setOptions(basement, 0);
		corridor4.setOptions(laundryroom, 1);
		corridor4.setOptions(foyer, 2);
		corridor4.setOptions(wall, 3);

		laundryroom.setOptions(wall, 0);
		laundryroom.setOptions(wall, 1);
		laundryroom.setOptions(wall, 2);
		laundryroom.setOptions(corridor4, 3);
		
		basement.setOptions(wall, 0);
		basement.setOptions(wall, 1);
		basement.setOptions(corridor4, 2);
		basement.setOptions(wall, 3);
		
		backyard.setOptions(wall, 0);
		backyard.setOptions(wall, 1);
		backyard.setOptions(backdoor, 2);
		backyard.setOptions(wall, 3);
	}
}
