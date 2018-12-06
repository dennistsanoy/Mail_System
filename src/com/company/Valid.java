package com.company;

import java.util.Scanner;

public class Valid {
    public static int validMenuInput() {
        Scanner input = new Scanner(System.in);

        int option = intVariableValidation();

        while ((option != 0) && (option != 1) && (option != 2) && (option != 3)) {
            System.out.print("\nInvalid option. Please select an option between (0-3): ");
            option = input.nextInt();
        }

        return option;
    }

    // overload method
    public static int intVariableValidation(){//integer
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.print("\nEnter an integer: ");
        while(!input.hasNextInt()){
            System.out.print("Invalid Input. \nEnter an Integer: ");
            input.next();
        }
        n = input.nextInt();

        return n;
    }

    public static String stringVariableValidation(){//integer
        Scanner input = new Scanner(System.in);

        String n = input.nextLine();

        System.out.print("\nEnter an integer: ");
        while(!input.hasNextInt()){
            System.out.print("Invalid Input. \nEnter a String: ");
            input.next();
        }
        n = input.nextLine();

        return n;
    }

    public static String typeValidation(){
        Scanner input = new Scanner(System.in);

        String n = stringVariableValidation();

        while(!((n == "1") || (n == "2") ||(n == "3") || (n == "n/a"))){
            System.out.print("Invalid Input. \nEnter '1', '2', '3' or 'n/a' ");
            input.nextLine();
        }
        n = input.nextLine();

        return n;
    }
}
