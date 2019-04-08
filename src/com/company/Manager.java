package com.company;
import java.util.Scanner;


public class Manager extends Employee {
    double yearWage; // yearly wage
    double hoursWorked; // hours worked for week
    String employType;
    Scanner in = new Scanner(System.in);


    public void manInput(){
        System.out.print("Please enter first name: ");
        setFirstName(in.nextLine());

        System.out.print("Please enter last name: ");
        setLastName(in.nextLine());

        System.out.print("Please enter Employee Id number: ");
        setEmployeeId(in.nextInt());

        System.out.print("Enter employee salary:");
        yearWage = in.nextDouble();



        System.out.println("Employee Name: " + getFirstName() + " " + getLastName());
        System.out.println("Employee ID:   " + getEmployeeId());
        System.out.println("Employee type: Cashier");
        System.out.println("Employee Yearly Salary: " + yearWage);
        System.out.println("Weekly pay:  " + (yearWage / 52));
    }//end of manInput

}// end of manager class
















