public class CategoryB{
	double salesAmt;
	double baseSalary;
	final static double comission=0.02;
	public CategoryB(double sa,double base){
		baseSalary=base;
		salesAmt=sa;
	}
	public double getSalary(){
		return (baseSalary+(comission*salesAmt));
	}
}
