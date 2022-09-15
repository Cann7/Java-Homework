package August18THHomework;

import java.util.Scanner;

public class Homework36Emp {
//    Write code with followings
//    Write Employee Class where it has Int "Employee Id", String "Employee Name" and double "Employee Salary"
//    Write a code where It ask user to enter Employee ID, Employee Name and Employee Salary where anytime user creates a new object of Employee Class.

    public int EmployeeId;
    public String EmployeeName;
    public double EmployeeSalary;

    public Homework36Emp(){
        Scanner Scn= new Scanner(System.in);
        System.out.println("Employee ID");
        this.EmployeeId=Scn.nextInt();
        System.out.println("Employee Name");
        this.EmployeeName=Scn.next();
        System.out.println("Employee Salary");
        this.EmployeeSalary=Scn.nextDouble();
    }

    public static void main(String[] args) {
        Homework36Emp Emply=new Homework36Emp();
        System.out.println("\r\nEmployee ID: " +Emply.EmployeeId+ "\r\nEmployee Name : " +Emply.EmployeeName+ "\r\nEmployee Salary$ : " +Emply.EmployeeSalary);
    }

}

