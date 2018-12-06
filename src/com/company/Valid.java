package com.company;

import java.util.Scanner;

public class Valid {
    public static int validMenuInput() {
        Scanner input = new Scanner(System.in);

        int option = intVariableValidation();

        while ((option != 0) && (option != 1) && (option != 2) && (option != 3)) {
            System.out.print("\nInvalid option. Please select an option between (0-3): ");
            option = intVariableValidation();
        }

        return option;
    }

    // overload method
    public static int intVariableValidation(){//integer
        Scanner input = new Scanner(System.in);

        while(!input.hasNextInt()){
            input.next();
            System.out.print("Invalid Input. \nEnter an Integer: ");
        }
        int n = input.nextInt();

        return n;
    }

    public static String typeValidation(){
        Scanner input = new Scanner(System.in);

        String n = input.nextLine();

        while(((!n.equals("1")) && (!n.equals("2")) && (!n.equals("n/a")))){
            System.out.print("Invalid Input. \nEnter '1', '2', or 'n/a': ");
            n = input.nextLine();
        }

        return n;
    }

    public static String priorityValidation(){
        Scanner input = new Scanner(System.in);

        String n = input.nextLine();

        while(((!n.equals("1")) && (!n.equals("2")) && (!n.equals("3")) && (!n.equals("n/a")))){
            System.out.print("Invalid Input. \nEnter '1', '2', '3' or 'n/a': ");
            n = input.nextLine();
        }

        return n;
    }
}
