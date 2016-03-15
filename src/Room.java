import java.util.ArrayList;
import java.util.Random;
public class Room extends Room1{

	
	private String name;
	private ArrayList<String> items= new ArrayList<String>();
	
     int count=0;

	private String message;
	private String visited;
	


	public Room() {
		super();
	}

	
	public Room(String roomName,ArrayList<String> goods, String letters, String visit){
		name=roomName;
		items=goods;
	
		message= letters;
		visited= visit;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getVisited() {
		return visited;
	}


	public void setVisited(String visited) {
		this.visited = visited;
		count++;
	}

	public int getCount(){
		return count;
	}

	public ArrayList<String> getItems() {
		return items;
	}


	public void setItems(ArrayList<String> items) {
		this.items = items;
	}


	public void additem(String item) {
		
		items.add(item);
	}




}
