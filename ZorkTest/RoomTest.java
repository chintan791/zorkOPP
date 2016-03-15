import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {
	
	
	//Check rooms initialization
	 @Test
	   public void test_name1() 
	 {
	Room c= new Room();
	System.out.println("Check if rooms are initialized ");
	c.setName("CheckRoom");
	assertEquals(c.getName(), "CheckRoom" );
	System.out.println("Works");
		 
	 }
	 
	 // Check items are getting added
	 @Test
	   public void test_item1() 
	 {
	Room c= new Room();
	System.out.println("Check if items are getting added ");
	
	// c.setItems();
	c.additem("ceiling");
	c.additem("snake");
	assertEquals(c.getItems().get(1), "snake");
	System.out.println("Works");
	 }
	 
	 
	 //Check if message is same
	 @Test
	   public void test_letter1() 
	 {
	Room c= new Room();
	System.out.println("Check if message works fine ");
	c.setMessage("Ghost Room");
	assertSame(c.getMessage(), "Ghost Room" );
	System.out.println("Works");
		 
	 }
	 
	 // Check if message Not Same condition works well
	 @Test
	   public void test_Message2() 
	 {
	Room c= new Room();
	System.out.println("Check if message is different ");
	c.setMessage("CheckRoom");
	assertNotSame(c.getMessage(), "CheckRoommmm" );
	System.out.println("Works");
		 
	 }
	 
	 // Assert True check if new item array is empty
	 @Test
	   public void test_Items2() 
	 {
	Room c= new Room();
	System.out.println("Check if array is empty at start ");
	c.getItems();
	assertTrue(c.getItems().isEmpty());
	System.out.println("Works");
		 
	 }
	 
	 
	 // Checking if money is obtained correctly
	 
	 @Test
	   public void test_money1() 
	 {
	Room c= new Room();
	System.out.println("Check if money is compared properly");
	c.setMoney(100);
	assertFalse(c.money() > 288 );
	System.out.println("Works");
		 
	 }
	 
	 // Checking if two things in array are same
	 @Test
	   public void test_Items3() 
	 {
	Room c= new Room();
	System.out.println("Check if array stores same items");
	c.additem("Lion");
	c.additem("Tiger");
	c.additem("Lion");
	assertArrayEquals(c.getItems().get(0), c.getItems().get(2));
	System.out.println("Works");
		 
	 }

	private void assertArrayEquals(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	 
	 
	 
	 }

