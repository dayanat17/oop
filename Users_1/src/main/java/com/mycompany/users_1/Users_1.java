/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.users_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Users_1 {

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
   
        ArrayList<Users> users = new ArrayList<>();
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
                    System.out.println("\nUser Nro.: " + (users.size()+1));   
            
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

                    Users user = new Users(
                    ident_number,
                     firstname,
                     lastname,
                      email,
                      age
                     );

                    users.add(user);
                    System.out.println("\nUser has been registered successfully !!!");
                    System.out.println("\nPress any key to back to main menu.");
                    key=data.nextLine();
                    break;
                case 2:

                 System.out.println("Total users: " + users.size());

           if (users.size() == 0) {
                System.out.println("No users !!!");
         } else {

           for (int j = 0; j < users.size(); j++) {

            Users u = users.get(j);

            System.out.println("User " + (j + 1) + ": "
                    + u.getIdentNumber() + " | "
                    + u.getFirstName() + " | "
                    + u.getLastName() + " | "
                    + u.getEmail() + " | "
                    + u.getAge());
        }
    }

            System.out.println("\nPress any key to back to main menu.");
            key = data.nextLine();
            break;
             case 3:

            System.out.println("Identification number to search:");
            ident_number = data.nextLine();

          boolean found = false;

           for (Users u : users) {

            if (u.getIdentNumber().equals(ident_number)) {

            System.out.println("User found:");

            System.out.println(
                    u.getIdentNumber() + " | "
                    + u.getFirstName() + " | "
                    + u.getLastName() + " | "
                    + u.getEmail() + " | "
                    + u.getAge());

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

        for (Users u : users) {

        if (u.getIdentNumber().equals(ident_number)) {

            System.out.println("New first name:");
            firstname = data.nextLine();

            System.out.println("New last name:");
            lastname = data.nextLine();

            System.out.println("New email:");
            email = data.nextLine();

            System.out.println("New age:");
            age = data.nextInt();
            data.nextLine();

            u.setFirstName(firstname);
            u.setLastName(lastname);
            u.setEmail(email);
            u.setAge(age);

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

    for (int j = 0; j < users.size(); j++) {

        if (users.get(j).getIdentNumber().equals(ident_number)) {

            users.remove(j);

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

    

