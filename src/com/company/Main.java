package com.company;
import java.awt.*;
import java.util.Scanner;
public class Main {
    //make a public multidimensional array to store mail information files in -> public static var[] listName;
    public static void main(String[] args) {
        int choice;
        String sChoice;
        String quit = "0";
        int search = 1;
        int input = 2;
        int display = 3;
        String[][] database = Mail_Database.Database();
        String[][] bDatabase = database;
        choice = MainMenu.main();
        sChoice = Integer.toString(choice);
        if (!sChoice.equals(quit)) {
            do {
                if (choice == search) {
                    Search_Items.main();
                    String[] sTerms = PromptUser.main();
                    int[] spot = Search_Items.Search(sTerms, bDatabase);
                    Search_Items.printMatch(spot, bDatabase);
                } else if (choice == input) {
                    String[][] nDatabase = Mail_Database.nDatabase(bDatabase);
                    bDatabase = nDatabase;
                } else if (choice == display) {
                    Mail_Database.printArray(bDatabase);
                }
                System.out.println();
                choice = MainMenu.main();
                sChoice = Integer.toString(choice);
            } while (!sChoice.equals(quit));
        }
    }

}
