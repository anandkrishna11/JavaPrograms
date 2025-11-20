package exam;

abstract class Employee{
	String name;
	double salary;
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	abstract double calculateSalary();
	abstract void displayInfo();
}

class Manager extends Employee{
	double allowance;
	Manager(String name,double salary, double allowance){
		super(name,salary);
		this.allowance=allowance;
	}
	double calculateSalary() {
		return (salary+ allowance);
	}
	void displayInfo() {
		System.out.println("---Manager Dateails---");
		System.out.println("Name: "+name);
		System.out.println("Salary= "+calculateSalary());
	}
	
}
class Programer extends Employee{
	double bonus;
	Programer(String name,double salary,double bonus){
		super(name,salary);
		this.bonus=bonus;
	}
	double calculateSalary() {
		return salary+bonus;
	}
	void displayInfo() {
		System.out.println("---Programer Details---");
		System.out.println("Name: "+name);
		System.out.println("Salary= "+calculateSalary());
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		Manager m1=new Manager("alwin",28000,4000);
		Programer p1=new Programer("davis",30000,1500);
		m1.displayInfo();
		System.out.println("   ");
		p1.displayInfo();

	}

}
