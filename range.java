package range;

import java.util.Scanner;

public class range {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range:");
		int number = sc.nextInt();
		for (int i=0;i<=number;i++) {
			System.out.println(+i);
		}
	}
}
