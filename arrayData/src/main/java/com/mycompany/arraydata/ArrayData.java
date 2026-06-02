/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraydata;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 
 */
public class ArrayData {

    public static void mainMenu(){ 
        System.out.println("::: MAIN MENU :::\n"
                + "[1]. Create/register users \n"
                + "[2]. List users \n"
                + "[3]. Search user \n"
                + "[4]. Update user \n"
                + "[5]. Delete user \n"
                + "[6]. Exit \n"
                + ".::: Press an option: ");
    }
    
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
   
        ArrayList<String> identNumbers = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        String firstname, lastname, email, key, ident_number;
        int age, opt;
        boolean menu_status = true;
        
        int i=1;
        while(menu_status){
            mainMenu();
            opt=data.nextInt();
            data.nextLine();
            
            switch (opt){
                case 1:
                    System.out.println("::: REGISTER NEW USER :::");
                    System.out.println("\nUser Nro.: " + (firstNames.size()+1));   
            
                    System.out.println("Identification number: ");   
                    ident_number=data.nextLine();
                    System.out.println("First name: ");   
                    firstname=data.nextLine();
                    System.out.println("Last name: ");   
                    lastname=data.nextLine();
                    System.out.println("Email: ");   
                    email=data.nextLine();
                    System.out.println("Age: ");   
                    age=data.nextInt();
                    data.nextLine();

                    identNumbers.add(ident_number);
                    firstNames.add(firstname);
                    lastNames.add(lastname);
                    emails.add(email);
                    ages.add(age);
                    System.out.println("\nUser has been registered successfully !!!");
                    System.out.println("\nPress any key to back to main menu.");
                    key=data.nextLine();
                    break;
                case 2:
                    
                    System.out.println("Total users: " + firstNames.size());
                    if (firstNames.size() == 0){
                        System.out.println("No users !!!");
                    }else{
                        for(int  j = 0; j < firstNames.size(); j+=1){
                            System.out.println("User " + (j+1) + ": " 
                                    + identNumbers.get(j) + " | " 
                                    + firstNames.get(j) + " | " 
                                    + lastNames.get(j) + " | " 
                                    + emails.get(j) + " | " 
                                    + ages.get(j));
                        }
                    }
                    System.out.println("\nPress any key to back to main menu.");
                    key=data.nextLine();
                    break;
                case 3:
            System.out.println("Identification number to search:");
            ident_number = data.nextLine();

            boolean found = false;

            for (int j = 0; j < identNumbers.size(); j++) {
     if (identNumbers.get(j).equals(ident_number)) {
            System.out.println("User found:");
            System.out.println(
                identNumbers.get(j) + " | " +
                firstNames.get(j) + " | " +
                lastNames.get(j) + " | " +
                emails.get(j) + " | " +
                ages.get(j)
            );

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("User not found.");
    }

                System.out.println("\nPress any key to back to main menu.");
                key = data.nextLine();
                break;
                case 4:
                System.out.println("Identification number to update:");
                ident_number = data.nextLine();

          found = false;

    for (int j = 0; j < identNumbers.size(); j++) {

        if (identNumbers.get(j).equals(ident_number)) {

            System.out.println("New first name:");
            firstname = data.nextLine();

            System.out.println("New last name:");
            lastname = data.nextLine();

            System.out.println("New email:");
            email = data.nextLine();

            System.out.println("New age:");
            age = data.nextInt();
            data.nextLine();

            firstNames.set(j, firstname);
            lastNames.set(j, lastname);
            emails.set(j, email);
            ages.set(j, age);

            System.out.println("User updated successfully.");

            found = true;
                break;
        }
    }

            if (!found) {
                System.out.println("User not found.");
    }

                  System.out.println("\nPress any key to back to main menu.");
                  key = data.nextLine();
                   break;
                case 5:
                    System.out.println("Identification number to delete:");
                    ident_number = data.nextLine();

                   found = false;

          for (int j = 0; j < identNumbers.size(); j++) {

             if (identNumbers.get(j).equals(ident_number)) {

            identNumbers.remove(j);
            firstNames.remove(j);
            lastNames.remove(j);
            emails.remove(j);
            ages.remove(j);

                System.out.println("User deleted successfully.");

                found = true;
                 break;
        }
    }

        if (!found) {
                 System.out.println("User not found.");
    }

                 System.out.println("\nPress any key to back to main menu.");
                  key = data.nextLine();
                  break;
                case 6:
                    System.out.println("Bye, bye");
                    menu_status = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}
