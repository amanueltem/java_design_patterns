public class MainApp{
	public static void main(String[] args){
		SalaryCalculator c=new CategoryA(10000,200);
		Employee e=new Employee("Berhe",c);
		e.display();
		System.out.println("\n\n=====================\n\n");
		c=new CategoryB(10000,8000);
		e= new Employee("Hagos",c);
		e.display();
	}
}
