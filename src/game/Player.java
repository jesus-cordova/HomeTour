package game;

import fixtures.Room;

public class Player {
	
	Room currentRoom;
	Boolean hasWon = false;

	public Room getCurrentRoom()
	{
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom)
	{
		this.currentRoom = currentRoom;
	}
	public void setHasWon(boolean hasWon) {
		this.hasWon = hasWon;
	}
	public boolean hasCode() {
		return hasWon;
	}
	
}
