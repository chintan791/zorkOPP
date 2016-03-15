import java.util.Random;
import java.util.Scanner;
public class House {





	public static void main(String[] args) {

		
	 int r1=1;
	 int r2 =1;
	 int r3= 1;
	 int r4=1;
	 int r5=1;
	 int r6=1;
	 int r7= 1;
	 int r8=1;
	 
		int add=0;
		int count=0;

		Scanner sc=new Scanner(System.in);



		Room Foyer = new Room();
		Foyer.setName("The Foyer");
		Foyer.getName();
		System.out.println(Foyer.getName());

		Room FrontRoom = new Room();
		FrontRoom.setName("The Front Room");
		FrontRoom.getName();
		System.out.println(FrontRoom.getName());

		Room Kitchen = new Room();
		Kitchen.setName("The Kitchen");

		Room Parlor = new Room();
		Parlor.setName("The Parlor");

		Room Vault= new Room();
		Vault.setName("The Vault");


		Room SecretRoom = new Room();
		SecretRoom.setName("The Secret Room");

		Room Library= new Room();
		Library.setName("The Library");


		Room DiningRoom = new Room();
		DiningRoom.setName("The Dining Room");



		Room present= new Room();
		present.getName();
		System.out.println(present.getName());
		present= Foyer;

		Report Foyer1= new Report();
		
		Report FrontRoom1= new Report();
		
		Report Kitchen1 = new Report();
		
		Report Parlor1 = new Report();
		
		Report Vault1 = new Report();
		
		Report SecretRoom1 = new Report();
		
		Report Library1= new Report();
		
		Report DiningRoom1 = new Report();
		
		String option="";



		while (!option.equals("exit"))
		{
			if(present==Foyer)
			{
				Foyer.getName();
				System.out.println(Foyer.getName());
				
				if(r1==1){
					Random rnd = new Random();
					int totalAmount = 1 + rnd.nextInt(1000);
					r1=0;
					add+=totalAmount;
					
					Foyer1.setCashCollected(totalAmount);
					Foyer1.getCashCollected();
					System.out.println("The cash collected is ");
					System.out.println(Foyer1.getCashCollected());
					System.out.println("Total amount is "+ add);
					
                   count++;
					
				Foyer1.setNoOfRooms(count);
				Foyer1.getNoOfRooms();
					System.out.println("The no of rooms changed "+ Foyer1.getNoOfRooms());
					}
			

				System.out.println("The Foyer has ");
				Foyer.additem("dead Scorpion");
				Foyer.additem("Snakes");
				Foyer.getItems();
				
				System.out.print(Foyer.getItems());

				System.out.println("Select N for FrontRoom");
				String direct = sc.next();
				
				
				
				if (direct.equals("N"))
				{
					present= FrontRoom;

				}

				else if (direct.equals("exit"))
				{
					break;
				}
			}
			if (present==FrontRoom)
			{
				FrontRoom.getName();
				System.out.println(FrontRoom.getName());
				
				if(r2==1){
					Random rnd = new Random();
					int totalAmount = 1 + rnd.nextInt(1000);
					r2=0;
					
					add+=totalAmount;
					
					FrontRoom1.setCashCollected(totalAmount);
					FrontRoom1.getCashCollected();
					System.out.println("The cash collected is ");
					System.out.println(FrontRoom1.getCashCollected());
					System.out.println("Total amount is "+ add);
				count++;	
				
				FrontRoom1.setNoOfRooms(count);
				FrontRoom1.getNoOfRooms();
					System.out.println("The no of rooms changed "+ FrontRoom1.getNoOfRooms());
				}

				System.out.println("The FrontRoom has ");
				FrontRoom.additem("Piano");
				FrontRoom.getItems();
				System.out.println(FrontRoom.getItems());

				System.out.println("Select W for Library or E for Kitchen");
				String direct = sc.next();

				
					
				
				if (direct.equals("W"))
				{
					present= Library;

				}

				else if (direct.equals("E"))
				{
					present= Kitchen;
				}
				else if (direct.equals("exit"))
				{
					break;
				}
			}
			if (present==Library)
			{

				
				Library.getName();
				System.out.println(Library.getName());
				

				if(r3==1){
					Random rnd = new Random();
					int totalAmount = 1 + rnd.nextInt(1000);
					r3=0;
					
					add+=totalAmount;
					
					Library1.setCashCollected(totalAmount);
					Library1.getCashCollected();
					System.out.println("The cash collected is ");
					System.out.println(Library1.getCashCollected());
					System.out.println("Total amount is "+ add);
					
					count++;
					
					Library1.setNoOfRooms(count);
					Library1.getNoOfRooms();
						System.out.println("The no of rooms changed "+ Library1.getNoOfRooms());
					}


				System.out.print("The Library has ");
				Library.additem("spiders");
				Library.getItems();
				System.out.println(Library.getItems());

				System.out.println("Select N for Dining Room or E for Front Room");
				String direct = sc.next();

				if (direct.equals("N"))
				{
					present= DiningRoom;

				}

				else if (direct.equals("E"))
				{
					present= FrontRoom;
				}
				else if (direct.equals("exit"))
				{
					break;
				}
			}

			if (present==DiningRoom)
			{
				DiningRoom.getName();
				System.out.println(DiningRoom.getName());

				if(r4==1){
					Random rnd = new Random();
					int totalAmount = 1 + rnd.nextInt(1000);
					r4=0;
					
					add+=totalAmount;
					
					DiningRoom1.setCashCollected(totalAmount);
					DiningRoom1.getCashCollected();
					System.out.println("The cash collected is ");
					System.out.println(DiningRoom1.getCashCollected());
					System.out.println("Total amount is "+ add);
				count++;	
				
				DiningRoom1.setNoOfRooms(count);
				DiningRoom1.getNoOfRooms();
					System.out.println("The no of rooms changed "+ DiningRoom1.getNoOfRooms());
				}

				System.out.println("The dining room has ");
				DiningRoom.additem("dust");
				DiningRoom.additem("empty box");
				System.out.println(DiningRoom.getItems());

				System.out.println("Select S for Library");
				String direct = sc.next();

				if (direct.equals("S"))
				{
					present= Library;

				}

				else if (direct.equals("exit"))
				{
					break;
				}

			}	

			if (present == Kitchen)
			{
				Kitchen.getName();

				System.out.println(Kitchen.getName());
				
				if(r5==1){
					Random rnd = new Random();
					int totalAmount = 1 + rnd.nextInt(1000);
					r5=0;
					
					add+=totalAmount;
					
					Kitchen1.setCashCollected(totalAmount);
					Kitchen1.getCashCollected();
					System.out.println("The cash collected is ");
					System.out.println(Kitchen1.getCashCollected());
					System.out.println("Total amount is "+ add);
					count++;
					
					Kitchen1.setNoOfRooms(count);
					Kitchen1.getNoOfRooms();
						System.out.println("The no of rooms changed "+ Kitchen1.getNoOfRooms());
		}

				
				System.out.print("The Kitchen has ");
				Kitchen.additem("Bats");
				Kitchen.getItems();
				System.out.println(Kitchen.getItems());


				System.out.println("Select N for Parlor or W for Front Room");
				String direct = sc.next();

				if (direct.equals("N"))
				{
					present= Parlor;

				}

				else if (direct.equals("W"))
				{
					present= FrontRoom;
				}
				else if (direct.equals("exit"))
				{
					break;
				}
			}

			if (present== Parlor)
			{
				Parlor.getName();
				System.out.println(Parlor.getName());
				
				if(r6==1){
					Random rnd = new Random();
					int totalAmount = 1 + rnd.nextInt(1000);
					r6=0;
					
					add+=totalAmount;
					
					Parlor1.setCashCollected(totalAmount);
					Parlor1.getCashCollected();
					System.out.println("The cash collected is ");
					System.out.println(Parlor1.getCashCollected());
					System.out.println("Total amount is "+ add);
				count ++;	
				
				Parlor1.setNoOfRooms(count);
				Parlor1.getNoOfRooms();
					System.out.println("The no of rooms changed "+ Parlor1.getNoOfRooms());
				}


				System.out.print("The Parlor contains ");
				Parlor.additem("Treasure Chest");
				Parlor.getItems();
				System.out.println(Parlor.getItems());

				System.out.println("Select W for Vault or S for Kitchen");
				String direct = sc.next();

				if (direct.equals("W"))
				{
					present= Vault;

				}

				else if (direct.equals("S"))
				{
					present= Kitchen;
				}
			}

			if (present == Vault)
			{

				System.out.print("The Vault has ");
				Vault.additem("3 walking Skeletons");
				Vault.getItems();
				System.out.print(Vault.getItems());
				
				if(r7==1){
					Random rnd = new Random();
					int totalAmount = 1 + rnd.nextInt(1000);
					r7=0;
					
					add+=totalAmount;
					
					Vault1.setCashCollected(totalAmount);
					Vault1.getCashCollected();
					System.out.println("The cash collected is ");
					System.out.println(Vault1.getCashCollected());
					System.out.println("Total amount is "+ add);
					count++;
					
					Vault1.setNoOfRooms(count);
					Vault1.getNoOfRooms();
						System.out.println("The no of rooms changed "+ Vault1.getNoOfRooms());
				}

				
				Vault.setMessage("You are in the Vault, wait for it");

				Random rnd = new Random();
				int randomInt = 1 + rnd.nextInt(4);

				System.out.println("The number is "+ randomInt);

				if (randomInt == 1 ) 

				{
					System.out.println("You found a new door, would you like to enter- Y/N");
					String secret = sc.next();
					if (secret.equals("Y"))
					{
						present=SecretRoom;
					}
					else if(secret.equals("N")){
						present= Vault;
					}
				}

				else 
				{
					System.out.println("Press E to go back to Parlor");
					String back = sc.next();
					if (back.equals("E")){
						present=Parlor;
					}

				}
			}

			if (present== SecretRoom)
			{
				SecretRoom.getName();
				System.out.println(SecretRoom.getName());
				
				if(r8==1){
					Random rnd = new Random();
					int totalAmount = 1 + rnd.nextInt(1000);
					r8=0;
					
					add+=totalAmount;
					
					SecretRoom1.setCashCollected(totalAmount);
					SecretRoom1.getCashCollected();
					System.out.println("The cash collected is ");
					System.out.println(SecretRoom1.getCashCollected());
					System.out.println("Total amount is "+ add);
				count++;	
				
				SecretRoom1.setNoOfRooms(count);
				SecretRoom1.getNoOfRooms();
					System.out.println("The no of rooms changed "+ SecretRoom1.getNoOfRooms());
				}

				
				System.out.print("The Secret Room has ");
				SecretRoom.additem("Piles of Gold");
				SecretRoom.setMessage("I am Rich , look at all that gold");
				System.out.println(SecretRoom.getMessage());

				System.out.println("Return to previous room and leave the house");
				System.out.println("Press W to go back to Vault");
				String back = sc.next();
				if (back.equals("W")){
					present=Vault;
				}



			}

		}

	}
}












