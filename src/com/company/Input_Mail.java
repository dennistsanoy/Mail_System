package com.company;

import java.util.Scanner;
import java.util.Random;

public class Input_Mail {

    public static String[] Terms(){
        String name;
        String mAddress;
        String mType;
        String mPriority;

        Scanner sc = new Scanner(System.in);

        //input last name
        System.out.print("Please enter the last name of recipient: ");
        name = sc.nextLine();

        //input address
        System.out.print("Please enter the address off recipient: ");
        mAddress = sc.nextLine();

        //input type of mail
        System.out.print("Please enter the type of mail (1 for package, 2 for letter): ");
        mType = sc.nextLine();

        //input priority of mail
        System.out.print("Please enter the priority (1 for Urgent, 2 for expedited, 3 for standard): ");
        mPriority = sc.nextLine();

        String[] deliveryArray = new String[5];

        deliveryArray[0] = name;
        deliveryArray[1] = mAddress;

        //////////////////////////////////////////////////////////////////////////////////////////////////

        String typeOutput;
        String priorityOutput;

        //if mType = 1, output "Package"
        //if mType = 2, output "Letter"
        if (mType.equals ("1") ){
            typeOutput = "Package";
            deliveryArray[2] = typeOutput;
        }
        else if (mType.equals ("2")) {
            typeOutput = "Letter";
            deliveryArray[2] = typeOutput;
        }

        //if mPriority = 1, output "Urgent"
        //if mPriority = 2, output "Expedited"
        //if mPriority = 3, output "Standard"
        if (mPriority.equals ("1")) {
            priorityOutput = "Urgent";
            deliveryArray[3] = priorityOutput;
        }
        else if (mPriority.equals("2")) {
            priorityOutput = "Expedited";
            deliveryArray[3] = priorityOutput;
        }
        else if (mPriority.equals("3")) {
            priorityOutput = "Standard";
            deliveryArray[3] = priorityOutput;
        }
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        Random rand = new Random();

        int n = rand.nextInt(9);

        // Rand ETA
        String ETA = Integer.toString(n);

        deliveryArray[4] = ETA;

        return deliveryArray;
    }

}
