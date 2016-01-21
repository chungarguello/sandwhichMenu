package p1;

import java.util.Scanner;

//Chungsing Arguello
//Sandwhich menu
//CSC 164

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char option;
        double price;
        String sandwich = "";

        System.out.println("Welcome to SANDTASTIC SUBS\n");

        do {
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one\n");
            System.out.print("Enter your choice: ");

            // Get user input,convert to upper case and get first character
            option = input.next().toUpperCase().charAt(0);

           switch (option){
               case 'H':
                   price = 5.50;
                   sandwich = "Ham";
                   break;

               case 'R':
                   price = 6.00;
                   sandwich = "Roast Beef";
                   break;

               case 'S':
                   price = 4.00;
                   sandwich = "Salami";
                   break;

               case 'T':
                   price = 4.50;
                   sandwich = "Tuna";
                   break;

               case 'D':
                   price = 0;
                   sandwich = "None";
                   break;

               default:
                   price = 0;
                   System.out.println("option " + option + " is not available");
           }
            // Give the user the order information,, if valid order
            if (price != 0) {
                System.out.printf(sandwich + " sandwich " + "cost: $%.2f", price);
                System.out.println("\n");
            }

        }while (option != 'D');

        System.out.println("\n\nThank you for ordering at Sandtastic SUBS");
    }
}
