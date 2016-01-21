package p1;

import java.util.Scanner;

//Chungsing Arguello
//Sandwhich menu
//CSC 164
public class Main {

    public static void main(String[] args) {
	    /*
            print hello message
        do while loop
            present menu
            ask for user input
                switch on user input
            get price
            print choice and price
            end switch
        End loop
        ---------------------
        switch(int expression)
        string choice = input.next();b
        char option = choice.charAt(0);
        */

        Scanner input = new Scanner(System.in);
        char option;

        System.out.println("Welcome to SANDTASTIC SUBS\n");

        do {
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one\n");
            System.out.print("Enter your choice: ");

            // get user input and convert to upper case
            String choice = input.next();
            choice = choice.toUpperCase();
            option = choice.charAt(0);

            // get the first character of the user input
            System.out.println("choice = " + choice + "\noption = " + option);

        }while (option != 'D');

        System.out.println("\n\nThank you for ordering at Sandtastic SUBS");
    }
}
