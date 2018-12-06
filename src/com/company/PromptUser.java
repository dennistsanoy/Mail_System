package com.company;
import java.util.Scanner;

public class PromptUser {

    public static String[] main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Name (Enter 'n/a' if unknown): ");
        String name = input.nextLine();

        System.out.print("Delivery Address (Enter 'n/a' if unknown): ");
        String dAddress = input.nextLine();

        System.out.print("Type of Mail (Enter 1 - Package, 2 - Letter, 'n/a' if unknown): ");
        String mType = input.nextLine();

        System.out.print("Priority of Mail (Enter 'n/a' if unknown): ");
        String mPriority = input.nextLine();

        String[] mFile = new String[4];
        mFile[0] = name;
        mFile[1] = dAddress;
        if (mType.equals ("1") ){
            mFile[2] = "Package";
        }
        else if (mType.equals ("2")) {
            mFile[2] = "Letter";
        }
        else {
            mFile[2] = mType;
        }
        if (mPriority.equals ("1")) {
            mFile[3] = "Urgent";
        }
        else if (mPriority.equals("2")) {
            mFile[3] = "Expedited";
        }
        else if (mPriority.equals("3")) {
            mFile[3] = "Standard";
        }
        else {
            mFile[3] = mPriority;
        }
        System.out.println();


        return mFile;

    }

    //public void static
}
