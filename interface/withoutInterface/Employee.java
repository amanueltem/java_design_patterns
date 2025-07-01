public class Employee{
	CategoryA salaryCalculatorA;
	CategoryB salaryCalculatorB;
	String name;
	public Employee(String s,CategoryA c){
		name=s;
		salaryCalculatorA=c;
	}
	public Employee(String s,CategoryB c){
		name=s;
		salaryCalculatorB=c;
	}
	public void displayA(){
		System.out.println("name: "+name);
		System.out.println("Salary: "+salaryCalculatorA.getSalary());
	}
	public void displayB(){
		System.out.println("name: "+name);
		System.out.println("Salary: "+salaryCalculatorB.getSalary());
	}
}
