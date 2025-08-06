
package javalab;
import java.util.Scanner;
class Stud{
	String name;
	static int studentCount;
	
	Stud(String name){
		this.name=name;
	}
	public static void getStudentCount() {
		studentCount++;
		System.out.println("STudent Count="+studentCount);
	}
}

public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=1;
		while(n==1) {
			System.out.println("Enter student name:");
			String name=sc.nextLine();
			Stud stu=new Stud(name);
			stu.getStudentCount();
			System.out.println("Do you want to enetr more Student:(y/n)");
			String ch=sc.nextLine();
			if(ch.equalsIgnoreCase("n")) {
				n=0;
			}
		}
		sc.close();
	}

}
