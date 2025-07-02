public class SalesRep extends Employee{
	public String computeComponsetation(){
		return (" Sales Rep salary is Base + Comission + allowance - tax deuctions");
	}
	public SalesRep(String empName,String empId){
		super(empName,empId);
	}
}
