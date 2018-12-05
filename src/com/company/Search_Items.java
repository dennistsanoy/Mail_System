package com.company;


public class Search_Items {
    public static void main() {
        System.out.println("Input the following mail components to narrow down the search.\n");
    }

    public static int[] Search(String[] terms, String[][] database) {
        int[] spot = new int[25];
        System.out.println();
        boolean flag = false;
        for (int i = 0; i < database.length; i++) {
            for (int a = 0; a < database[i].length; a++) {
                for (int t = 0; t < terms.length; t++) {
                    if (terms[t].equals(database[i][a])){
                        flag = true;
                        spot[Mail_Database.findEmpty(spot)] = i;
                    }
                }
            }
        }
        return spot;
    }

    public static void printMatch(int[] spots, String[][] database){
        for(int i = 0; i < spots.length; i++) {
            if (spots[i] != 0){
                Mail_Database.printSingleArray(i, database);
            }
        }
    }

}
