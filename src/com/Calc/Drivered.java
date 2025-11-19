package com.Calc;

import java.util.Scanner;

public class Drivered {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CalcImplementation calc = new CalcImplementation();
        System.out.print("Enter the first number : ");
        int first = scan.nextInt();
        System.out.print("Enter the second numberjhgegvgjbb : ");
        int second = scan.nextInt();

        System.out.println("----------------------------------------------");
        System.out.println("1 is +");
        System.out.println("2 is /");
        System.out.println("3 is *");
        System.out.println("4 is -");
        System.out.print("Enter your choice : ");
        
        
        double res = 0;
        
        int choice = scan.nextInt();

        switch (choice) {
            case 1: {
                // add operation here
            	res=calc.add(first, second);
            	System.out.println("addition : "+res);
            }
            break;

            case 2: {
                // subtract operation here
            }
            break;

            case 3: {
             	// implemented by Ajay mul method
                res=calc.mul(first, second);
                System.out.println("multiplication : "+res);
            	
            }
            break;

            case 4: {
            	
            	// implemented by Ajay sub method
                res=calc.sub(first, second);
                System.out.println("substraction : "+res);
            }
            break;

            default: {
                System.out.println("------------INVALID CHOICE-------------");
            }
        }

        
        
     
     
    }
}
