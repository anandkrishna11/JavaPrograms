package exam;
import java.util.Scanner;

class EligibleException extends Exception{
	EligibleException(String str){
		super(str);
	}
}
class test{
	static void checkAge(int age)throws EligibleException{
		if(age<18) {
			throw new EligibleException("Not Eligible to Vote");
		}
		else {
			System.out.println("You are eligible for voting");
		}
	}
}

public class VottingEligibility {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try {
			test.checkAge(age);
		}catch(EligibleException e) {
			System.out.println("Exception found:"+e.getMessage());
		}
	}

}
