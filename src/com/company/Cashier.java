package com.company;


import java.util.Scanner;

public class Cashier extends Employee {
  double hourlyWage; // wage per hour
  double hoursWorked; // hours worked for week
    String employType;
  //string type;
        public void cashInput(){
            System.out.println("Employee Name: " + getFirstName() + " " + getLastName());
            System.out.println("Employee ID:   " + getEmployeeId());

            System.out.println("Enter employee wage:");
            Scanner in = new Scanner(System.in);
           // hourlyWage = in.nextLine();


            }
        }
}













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
