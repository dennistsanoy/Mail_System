package com.company;
import java.util.Scanner;

public class Test {
    public static void main() {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("This is a test class for testing random code concepts.");
//        variableValidation();
        String[][] array = new String[5][3];
        array[0] = new String[]{"One", "Two", "Three"};
        array[1] = new String[]{"1", "2", "3"};
        array[2] = new String[]{"o1ne", "t2wo", "th3ree"};


        String[] adder = {"not1", "not2", "not3"};
        array[3] = adder;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] != null) {
                    System.out.print(array[row][column] + " ");
                }
            }
            System.out.println();
        }



    }
    // overload method
    public static void variableValidation(){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("\nEnter an integer: ");
        while(!input.hasNextInt()){
            System.out.print("Invalid Input. \nEnter an Integer: ");
            input.next();
        }
        n = input.nextInt();

        System.out.println(n);
    }

    public static String[] inputMail(){
        // input mail function
        String name;
        String mAddress;
        String mType;
        String mPriority;

        Scanner sc = new Scanner(System.in);

        System.out.println("You have selected the Input Mail option.");

        //input last name
        System.out.println("Please enter the last name of recipient: ");
        name = sc.nextLine();

        //input address
        System.out.println("Please enter the address off recipient: ");
        mAddress = sc.nextLine();

        //input type of mail
        System.out.println("Please enter the type of mail (1 for package, 2 for letter): ");
        mType = sc.nextLine();

        //input priority of mail
        System.out.println("Please enter the priority (1 for Urgent, 2 for expedited, 3 for standard): ");
        mPriority = sc.nextLine();

        String[] deliveryArray = new String[]{name, mAddress, mType, mPriority, null};

        //test print debug
        for (int row = 0; row < deliveryArray.length; row++) {
            //for (int column = 0; column < deliveryArray[row].length; column++) {
            System.out.print(deliveryArray[row] + " ");
        }

        return deliveryArray;
    }

}
