package com.company;


import java.util.Scanner;

public class Cashier extends Employee {
  double hourlyWage; // wage per hour
  double hoursWorked; // hours worked for week
    String employType;
    Scanner in = new Scanner(System.in);

    //string type;

    public void cashInput(){
        System.out.print("Please enter first name: ");
        setFirstName(in.nextLine());

        System.out.print("Please enter last name: ");
        setLastName(in.nextLine());

        System.out.print("Please enter Employee Id number: ");
        setEmployeeId(in.nextInt());

        System.out.print("Enter employee wage:");
        hourlyWage = in.nextDouble();

        System.out.print("Enter total hours worked: ");
        hoursWorked = in.nextDouble();

        System.out.println("Employee Name: " + getFirstName() + " " + getLastName());
        System.out.println("Employee ID:   " + getEmployeeId());
        System.out.println("Employee type: Cashier");
        System.out.println("Employee wage: " + hourlyWage);
        System.out.println("Total hours worked: " + hoursWorked);
        System.out.println("Weekly pay:  " + (hoursWorked * hourlyWage));
        }//end of cashInput

}// end of Cashier{} class














//    // argument constructor
//    public Cashier() {
//        super();
//        this.hourlyWage = hourlyWage; // validate hourly wage
//        this.hoursWorked = hoursWorked; // validate hours worked
//    } // end five-argument HourlyEmployee constructor
//
//
//
//    // return wage
//    public double getWage() {
//        return hourlyWage;
//    } // end method getWage
//
//    // set wage
//    public void setWage(double hourlyWage) {
//        hourlyWage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
//    } // end method setWage
//
//    // return hours worked
//    public double getHours() {
//        return hoursWorked;
//    } // end method getHours
//
//    // set hours worked
//    public void setHours(double hoursWorked) {
//        hoursWorked = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ?
//                hoursWorked : 0.0;
//    } // end method setHours
//
//    // calculate earnings; override abstract method earnings in Employee
//    public double earnings() {
//        if (getHours() <= 40) // no overtime
//            return getWage() * getHours();
//        else
//            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
//    } // end method earnings
//
//    // return String representation of HourlyEmployee object
//    public String toString() {
//        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
//                super.toString(), "hourly wage", getWage(),
//                "hours worked", getHours());
//    } // end method toString
//} // end class HourlyEmployee
//
