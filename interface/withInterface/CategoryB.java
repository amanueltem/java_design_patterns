public class CategoryB implements SalaryCalculator{
	double salesAmt;
	double baseSalary;
	final static double comission=0.02;
	public CategoryB(double sa,double base){
		salesAmt=sa;
		baseSalary=base;
	}
	public double getSalary(){
		return (baseSalary+(salesAmt*comission));
	}
}
