package com.pluralsight;

import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
/**
 * create a java app in payroll calculator that promot a user to
 * enter name ,hour work, their hours work
 * and pay rate
 * calculate their grows pay
 *
 * display name and gross pay
 */


    System.out.print("Enter you name: ");
    String name = myScanner.nextLine();

    System.out.println("Enter your hours worked: ");
    float hoursWorked =myScanner.nextFloat();

    System.out.print("Enter your pay rate: ");
    float payrate = myScanner.nextFloat();

    float grossPay = hoursWorked * payrate;

    System.out.printf("%s earned $%.2f" , name , grosspay);



    }
}
