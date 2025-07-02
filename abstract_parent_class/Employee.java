public abstract class Employee {
    String name;
    String ID;

    public Employee(String empName, String empId) {
        name = empName;
        ID = empId;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return ID;
    }

    @Override
    public String toString() {
        return "Employee Name:: " + getName() + " Employee ID:: " + getId();
    }

    // Variable part of the behavior
    public abstract String computeComponsetation(); 
}

