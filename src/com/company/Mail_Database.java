package com.company;

public class Mail_Database {
    public static void main() {
        //make a multidimensional array to store mail information files in.

    }

    public static int FindEmpty(String[][] list){
        int fileZero = 0;

        for(int file = 0; file < list.length; file++) {
            if (list[file].length == 0) {
                fileZero += file;
                break;
            }
        }

        return fileZero;
    }
}
