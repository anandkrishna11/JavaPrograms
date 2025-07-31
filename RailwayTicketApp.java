import java.util.Scanner;
import java.util.jar.Attributes.Name;
class Ticket{
	String name;
	String station;
	String destination;
	int age;
	int cost;
	
	Ticket(String name,String station,String destination,int age){
		this.name=name;
		this.station=station;
		this.destination=destination;
		this.age=age;
		calculateCost();
	}
	public void calculateCost() {
		cost=500;
		if (age>59) {
			cost*=0.5;
		}
	}
	public void Ticketdetails()throws InterruptedException {
		System.out.println("Processing your Ticket....");
		Thread.sleep(3000);
		System.out.println("Ticket Details");
		System.out.println("Name: "+name);
		System.out.println("satation: "+station);
		System.out.println("destination: "+destination);
		System.out.println("Age: "+age);
		System.out.println("Ticket no: 1002");
		System.out.println("total Cost= "+cost);
	}
}

public class RailwayTicketApp{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your name: ");
			String name=sc.nextLine();
			System.out.println("Enter your boarding station:");
			String station=sc.nextLine();
			System.out.println("Enter your destination:");
			String destination=sc.nextLine();
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			Ticket ticket1 = new Ticket(name, station, destination, age);
			ticket1.Ticketdetails();
		}catch (InterruptedException e) {
			System.out.println("There was an error occured");
		}
		sc.close();
	}
}
