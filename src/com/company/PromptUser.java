package com.company;
import java.util.Scanner;

public class PromptUser {

    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Name (Enter 'n/a' if unknown): ");
        String name =  input.nextLine();

        System.out.println("Delivery Address (Enter 'n/a' if unknown): ");
        String dAddress = input.nextLine();

        System.out.println("Type of Mail (Enter 'n/a' if unknown): ");
        String mType = input.nextLine();

        System.out.println("Priority of Mail (Enter 'n/a' if unknown): ");
        String mPriority = input.nextLine();


}
