import java.util.Scanner;
class Costomer{
	String name;
	int consumerNumber;
	int unitsConsumed;
	static int ratePerUnit=7;
	
	Costomer(String name,int consumerNumber,int unitsConsumed){
		this.name=name;
		this.consumerNumber=consumerNumber;
		this.unitsConsumed=unitsConsumed;
	}
	
	public void Bill(int unitsConsumed) {
		int cost;
		cost=unitsConsumed*ratePerUnit;
		System.out.println("ELECTRICITY BILL:");
		System.out.println("Costomer Name: "+name +"\n UnitsConsumed: "+unitsConsumed +"\n Total Bill= "+ cost);
	}
	
}
public class ElectricityBillGenerator{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=1;
		while(n==1) {
			System.out.println("Enter Costomer Details");
			System.out.println("Name:");
			String name=sc.nextLine();
			System.out.println("cosumerNumber:");
			int cn=sc.nextInt();
			System.out.println("Units Consumed:");
			int unit=sc.nextInt();
			Costomer newCostomer=new Costomer(name,cn,unit);
			newCostomer.Bill(unit);
			System.out.println("More costomer?(Y/N)");
			String ch=sc.nextLine();
			if(ch.equalsIgnoreCase("n")) {
				n=0;
			}
		}
		sc.close();
	}
}
