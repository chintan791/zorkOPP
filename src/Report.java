
public class Report {
	
	private int cashCollected;
	private int noOfRooms;
	
	public Report(){
		
	}

	public Report( int totalCash, int roomsVisited){
		 
		totalCash= cashCollected;
		noOfRooms= roomsVisited;
	}

	public int getCashCollected() {
		return cashCollected;
	}

	public void setCashCollected(int cashCollected) {
		this.cashCollected = cashCollected;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	


}
