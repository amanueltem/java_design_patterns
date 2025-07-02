public class Consultunt extends Employee{
	public String computeComponsetation(){
		return ("consultant salary is base + allowance + OT - tax deductions");
	}
	public Consultunt(String empName,String empId){
		super(empName,empId);
	}
}
