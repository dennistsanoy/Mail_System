package com.company;

public class Main {
    //make a public multidimensional array to store mail information files in -> public static var[] listName;
    public static void main(String[] args){
        //make a multidimensional array to store mail information files in.
        int choice = MainMenu.main();
        Pathway(choice);


    }

    public static void Pathway(int option){
        if (option == 1){
            Search_Items.main();
        }
    }
}
