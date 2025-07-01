public class Employee{
	SalaryCalculator empType;
	String name;
	public Employee(String s,SalaryCalculator c){
		name=s;
		empType=c;
	}
	public void display(){
		System.out.println("name: "+name);
		System.out.println("salary: "+empType.getSalary());
	}
}
