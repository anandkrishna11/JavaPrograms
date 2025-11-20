package exam;

import java.util.Scanner;

class Student{
	String stuName;
	static int stuCount;
	
	Student(String stuName){
		this.stuName=stuName;
		stuCount++;
	}

	static void getStudentCount() {
		System.out.println("Number of student registered: "+stuCount);
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int end=0;
		while(end==0) {
				System.out.println("Enter the student name");
				String name=sc.next();
				Student stu=new Student(name);
				
				System.out.println("What to add more Students?(Y/N)");
				char choice=sc.next().charAt(0);
				
				if(choice=='N' || choice=='n') {
					end=1;
			}
		}
		
		Student.getStudentCount();

	}

}
