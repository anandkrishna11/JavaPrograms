package javalab;
class Student{
	String name;
	int roll_no;
	int m1,m2,m3;
	float avg;
	Student(String name,int roll_no,int m1,int m2,int m3){
		this.name=name;
		this.roll_no=roll_no;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void CalculateAverage() {
		avg=(m1+m2+m3)/2;
	}
	public void DisplayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Roll number:"+roll_no);
		System.out.println("Mark 1="+m1+" Mark2="+m2+" Mark3="+m3);
		System.out.println("Average Marks:"+avg);
	}
	
}

public class StudentDemo {

	public static void main(String[] args) {
		Student student1=new Student("David",36,56,76,69);
		student1.CalculateAverage();
		student1.DisplayDetails();
		Student student2=new Student("Henry",49,76,98,55);
		student2.CalculateAverage();
		student2.DisplayDetails();
		}

	}
