package javalab;
import java.util.Scanner;
class PaymentGateway{
	public void makePayments(String cardNumber,String expiryDate,String cvv) {
		System.out.println("Payment Method:CARD");
		System.out.println("Payment Done Successfully!");
	}
	public void makePayments(String upiID) {
		System.out.println("Payment Method:UPI");
		System.out.println("Payment Done Successfully!");
	}
	public void makePayments(double amount) {
		System.out.println("Order Confirmed!");
		System.out.println("Amount to be paid:"+amount);
	}
}

public class ECommerceApp {

	public static void main(String[] args) {
		PaymentGateway payment=new PaymentGateway();
		payment.makePayments(250.59);
		payment.makePayments("8606785412@oksbi");
		payment.makePayments("8081 4333 6754 6555","07/29","266");
	}

}
