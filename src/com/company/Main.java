/*Author: Stephen Scruggs

Create a fake company
        -Give company 2 different Employees (manager, cashier)
        -Use Employee as an abstract class
-Employees will share String name, int employeeId fields
        -Manager is a salaried employee, cashier is an hourly employee
        -As a user, I want the ability to calculate each employee's weekly pay

        *HINT:*
        -The user is asked to input the number of hours the cashier worked, then weekly pay is calculated.
        -The hours worked per week is irrelevant for a salaried employee, who is always paid the same amount.

        -Each class should have a constructor and a weeklyPay method. Only the abstract Employee class will have getters/setters
        -Create a design based on these requirements (doesn't have to be super detailed), create a Trello ticket ("Employee Design - <your name>"), and post them there
        -Ask any questions you might have!

        -----------------------------------------------------------------------------------------

        *Scanner flow should be something like this:*
        **If Cashier**
        Employee name:
        Employee Id:
        Employee Type:
        Hourly Rate:
        Hours Worked:
        (Upon hitting enter, this should display employee's info *see attached screenshot)

        **If Manager**
        Employee name:
        Employee Id:
        Employee Type:
        Annual Salary:
        (Upon hitting enter, this should display employee's info *see attached screenshot)
*/



package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu stephen = new Menu();
        stephen.ShowMenu();

    }
}