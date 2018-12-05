package com.company;

import java.util.Scanner;

public class Valid {
    public static int validMenuInput(int option) {
        Scanner input = new Scanner(System.in);

        while ((option != 0) && (option != 1) && (option != 2) && (option != 3)) {
            System.out.print("\nInvalid option. Please select an option between (0-3): ");
            option = input.nextInt();
        }

        return option;
    }

    // overload method
    public static void variableValidation(int n){//integer
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter an integer: ");
        while(!input.hasNextInt()){
            System.out.print("Invalid Input. \nEnter an Integer: ");
            input.next();
        }
        n = input.nextInt();

        System.out.println(n);
    }

    public static void typeValidation(int n){
        Scanner input = new Scanner(System.in);

        System.out.println("hi");
    }
}
