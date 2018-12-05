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

        String[] mFile = new String[5];
        mFile[0] = name;
        mFile[1] = dAddress;
        mFile[2] = mType;
        mFile[3] = mPriority;
        mFile[4] = "0";
        System.out.println();
        Mail_Database.printSingleArray(mFile);

        return mFile;

    }

    //public void static
}
