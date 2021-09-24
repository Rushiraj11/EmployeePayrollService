package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.model.EmployeePayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

    ArrayList<EmployeePayroll> employeePayrolls = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll Service");
        EmployeePayrollService service=new EmployeePayrollService();
        service.readData();
        service.writeData();
    }

    private void readData(){
        EmployeePayroll employeePayRoll=new EmployeePayroll();
        System.out.println("Enter Employee Id");
        employeePayRoll.setId(scan.nextInt());
        System.out.println("Enter Employee name");
        employeePayRoll.setName(scan.next());
        System.out.println("Enter Employee salary");
        employeePayRoll.setSalary(scan.nextDouble());
        employeePayrolls.add(employeePayRoll);
    }
    private void writeData(){
        System.out.println(employeePayrolls);
    }

}
