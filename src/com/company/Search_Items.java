package com.company;


public class Search_Items {
    public static void main() {
        System.out.println("\nInput the following mail components to narrow down the search.\n");
    }

    public static int[] Search(String[] terms, String[][] database) {
        int[] spot = new int[25];
        System.out.println();
        boolean theyMatch = true;
        for (int i = 0; i < database.length; i++) {
            for (int a = 0; a < terms.length; a++) {
                    if (terms[a].equals("n/a"));//do nothing
                    else if (!terms[a].equals(database[i][a])){
                        //they don't match!
                        theyMatch = false;
                        }
                }
                if (theyMatch == true){
                    spot[Mail_Database.findEmpty(spot)] = i;
                    }
                theyMatch = true;
            }
        return spot;
    }

    public static void printMatch(int[] spots, String[][] database){
        for(int i = 0; i < spots.length; i++) {
            if (spots[i] != 0){
                Mail_Database.printSingleArray(spots[i], database);
            }
        }
    }

}
