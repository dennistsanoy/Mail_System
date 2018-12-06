package com.company;

public class Mail_Database {
    public static String[][] Database() {
        //make a multidimensional array to store mail information files in.
        String[][] database = new String[25][5];

        //pre-existing files
        database[0] = new String[]{"Name", "Street Address", "Type", "Priority", "Days"};
        database[1] = new String[]{"Salas", "2463 Red Ct.", "Letter", "Urgent", "2"};
        database[2] = new String[]{"Wall", "5629 Intel St.", "Package", "Expedited", "4"};
        database[3] = new String[]{"Allen", "9638 Day Ct.", "Letter", "Urgent", "1"};
        database[4] = new String[]{"Allen", "3678 Spring St.", "Letter", "Standard", "8"};
        database[5] = new String[]{"Brave", "1534 Purse Dr.", "Package", "Expedited", "5"};
        database[6] = new String[]{"Chen", "9831 Utah St.", "Package", "Standard", "8"};
        database[7] = new String[]{"Pink", "5832 Delta Pl.", "Letter", "Expedited", "6"};
        database[8] = new String[]{"Yi", "3535 Monster Rd.", "Package", "Urgent", "1"};
        database[9] = new String[]{"Dennis", "0934 Dell Ave.", "Package", "Urgent", "3"};

        return database;
     }

    public static String[][] nDatabase(String[][] database) {
        String[] tArray = Input_Mail.Terms();
        String[][] nDatabase = Update(tArray, database);

        //method passed by arguements
        return nDatabase;

    }
        public static String[][] Update(String[] array, String[][] database){
        int newMail = findEmpty(database);
        database[newMail] = array;

        return database;
    }

    public static int findEmpty(String[][] database) {
        int n = 0;
        for (int i = 0; i < database.length; i++) {
            for (int a = 0; a < database[i].length; a++) {
                if (database[i][a] == null) {
                    n += i;
                    break;
                }
            }
            if (n != 0) {
                break;
            }
        }
        return n;
    }

    public static int findEmpty(int[] database){
        int n = 0;
        for (int i = 0; i < database.length; i++){
            if (database[i] == 0) {
                n += i;
                break;
            }
        }
        return n;
    }

    public static void printArray(int n, String[][] array){
        for (int i = 0; i < array[n].length; i++) {
            System.out.printf("%25s" , array[n][i]);
        }
        System.out.println();
    }


    public static void printArray(String[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] != null) {
                    System.out.printf("%25s" , array[row][column]);
                }
                if (array[row][column] == null) break;
            }
            System.out.println();
            if (array[row][0] == null) break;
        }
    }
}
