import java.util.Scanner;
class BankAccount{
	String AcHolder_Name;
	int Ac_Number;
	static String Bank_Name="State Bank Of India";
	int balance;
	
	BankAccount(String AcHolder_Name,int Ac_Number,int balance){
		this.AcHolder_Name=AcHolder_Name;
		this.Ac_Number=Ac_Number;
		this.balance=balance;
	}
	public void operation(Scanner sc)throws InterruptedException {
		System.out.println("Bank account verifying....");
		Thread.sleep(3000);
		System.out.println("Bank account fetched successfully!");
		System.out.println("1.account details \n 2.deposit \n 3.withdraw");
		System.out.println("Choose your operation:");
		int op=sc.nextInt();
		if (op==1) {
			acDetails();
		}
		else if(op==2) {
			deposit(sc);
		}
		else if(op==3) {
			withdraw(sc);
		}
		else {
			System.out.println("Invalid Choice");
		}
	}
	
	public void acDetails() {
		System.out.println("Account Holder: "+AcHolder_Name);
		System.out.println("Account Number:"+Ac_Number);
		System.out.println("Account Balance: "+balance);
		System.out.println("Bank Name:"+Bank_Name);
	}
	public void withdraw(Scanner sc) throws InterruptedException{
		System.out.println("Enter the amount to withdraw: ");
		int wrs=sc.nextInt();
		if(wrs > balance) {
			System.out.println("Insufficient Balance!");
		}
		else {
			System.out.println("Withdrawing processing....");
			Thread.sleep(3000);
			System.out.println("Withdrawal Completed!");
			balance-=wrs;
			System.out.println("Updated Balance: "+balance);
		}
	}
	public void deposit(Scanner sc) throws InterruptedException{
		System.out.println("Enter the amount to deposit: ");
		int drs=sc.nextInt();
		if(drs > 50000) {
			System.out.println("Maximum deposit is 50000rs");
		}
		else {
			System.out.println("Deposit processing....");
			Thread.sleep(3000);
			System.out.println("Deposit Completed!");
			balance+=drs;
			System.out.println("Updated Balance: "+balance);
		}
		sc.close();
}
public class BankAcManager {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your Name: ");
			String name=sc.nextLine();
			System.out.println("Enter your Account Number: ");
			int acnum=sc.nextInt();
			System.out.println("Enter your Account Balance");
			int bal=sc.nextInt();
			BankAccount account=new BankAccount( name, acnum, bal);
		    account.operation(sc);		
	}catch(InterruptedException e) {
		System.out.println("Error");
	}finally {
		sc.close();
	}
	}
}
}


