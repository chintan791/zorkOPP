import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestReport {

	//Check cash collected is correct
	 @Test
	   public void test_cash1() 
	 {
	Report r= new Report();
	System.out.println("Check if cash is being collected ");
	r.setCashCollected(100);
	assertEquals(r.getCashCollected(), 100 );
	System.out.println("Works");
		 
	 }
	 
	 // Check if number of rooms is correct
	 @Test
	   public void test_rooms1() 
	 {
		 Report r= new Report();
	System.out.println("Check if rooms are changing ");
	r.setNoOfRooms(1);
	assertSame(r.getNoOfRooms(), 1);
	System.out.println("Works");
	 }
	 
/*	 
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
	 */
}
