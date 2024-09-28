/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prompting;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Prompting {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name;
        String surname;
        String FullName;
        int age;
               int salary;
               int percentage;
               System.out.print("Enter your Name:");
                 name= sc.next();
                 
               System.out.print("Enter your surname:");
                 surname= sc.next();
                 
               System.out.print("Enter your age:");
                 age= sc.nextInt();
                 
               System.out.print("Enter your salary:");
                 salary= sc.nextInt();
                 
                 percentage= salary*10/100;
                 FullName= name + " " + surname;
                 System.out.println("FullName: " + FullName);
                 
               System.out.println("age:"+ age);
               System.out.println("10 percentage of salary:"+ percentage);
               
               System.out.println("whats your name");
                         
    }
}
