package com.company;

public class EmployeeMain {
    public void Employee(Employee employee) {
        employee.getEmployee();
    }

    public static void main(String[] args) {
	    EmployeeMain employee =  new EmployeeMain();
	    employee.whoAmI("191110236", "Yogi Prasetyawan Hadi");
        employee.Employee(new Manager("Manager", "2.000.000"));
        employee.Employee(new Manager("Staff", "1.000.000"));
    }

    private void whoAmI(String nim, String name) {
        System.out.println("NIM \t: "+ nim);
        System.out.println("Nama\t: "+ name);
        System.out.println("----------------------");
    }
}
