public class MainApp{
	public static void main(String[] args){
		CategoryA ca=new CategoryA(10000,200);
		Employee ea=new Employee("Berhe",ca);
		ea.displayA();
		System.out.println("\n\n===========================\n\n");
		CategoryB cb=new CategoryB(8000,10000);
		Employee eb=new Employee("Hagos",cb);
		eb.displayB();
	}
}
