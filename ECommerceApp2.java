import java.util.Scanner;
class PaymentGateway{
	public void makePayment(String CardNo,String ExpiryDate,String CVV) {
		System.out.println("Verifiying your card details.....");
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("An error occurred during delay.");
        }
		System.out.println("Confirming your payment.....");
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("An error occurred during delay.");
        }
		System.out.println("Payment successfully completed! Order Confirmed!");	
	}
	public void makeUpiPayment(String UpiID)throws InterruptedException {
		System.out.println("Sending payment request....");
		Thread.sleep(2000);
		System.out.println("Please complete the payment....");
		for (int i = 30; i > 0; i--) {
	        System.out.print("\rTime left to complete payment: " + i + "s");
	        Thread.sleep(1000);
	    }

	    System.out.println("\nPayment session expired.Checking..."); 
	    Thread.sleep(3500);
	    System.out.println("Payment Completed. Order Confirmed!");
	}
	public void makeCodPayment(int PinCode)throws InterruptedException {
		System.out.println("Checking COD available for given PIN Code....");
		Thread.sleep(4000);
		if (PinCode>=600000 && PinCode<=700000){
			System.out.println("COD available (: Order Confirmed!");
	}
		else {
			System.out.println("COD not available ): Order Cancelled!");
		}
	}
}
public class ECommerceApp2{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		PaymentGateway payment=new PaymentGateway();
		System.out.println("1.Card   2.Upi ID  3.Cash On Delivery");
		int op=sc.nextInt();
		sc.nextLine();
		try {
            if (op == 1) {
                System.out.println("Enter the card details:");
                System.out.print("Card Number: ");
                String cardNo = sc.nextLine();

                System.out.print("Expiry Date (MM/YY): ");
                String expDate = sc.nextLine();

                System.out.print("CVV: ");
                String cvv = sc.nextLine();

                payment.makePayment(cardNo, expDate, cvv);
            } else if (op == 2) {
                System.out.print("Enter the UPI ID: ");
                String upi = sc.nextLine();

                payment.makeUpiPayment(upi);
            } else if (op == 3) {
                System.out.print("Enter your PIN Code: ");
                int pin = sc.nextInt();

                payment.makeCodPayment(pin);
            } else {
                System.out.println("Invalid Choice. Payment Cancelled!");
            }
        } catch (InterruptedException e) {
            System.out.println("Payment process was interrupted.");
        }

        sc.close();
    }
}