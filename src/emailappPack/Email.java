/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailappPack;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Email {
    
    //private for encapsulation, prevent direct access
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    
    //Constructor
    //getting first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("User: " + this.firstName + " " + this.lastName);
        
        
        //getDepartment
        this.department = setDepartment();
        System.out.println("Select Department Number: " + this.department);
        
        //create and assign randomPassword
        this.password = randomPassword(8);
        System.out.println(this.password);
        
        //Create the email
        //NOTE - Email should add a number after lastName if user already exists.
        //Email needs to remove the "." after department if the user department = 0
        String userEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + ".thecompany.co.uk";
        System.out.println("Email created: " + userEmail);
        }
    
    //Methods
    
    //Get the department
    private String setDepartment(){
        System.out.print("Departments: \n1 Sales \n2 Accounting \n3 Development \n0 No Department");
        Scanner in = new Scanner(System.in);
        int selectedDepartment = in.nextInt();
        switch(selectedDepartment){
            case 1:
                return "Sales";
            case 2: 
                return "Accounting";    
            case 3: 
                return "Development";
            case 0:
                return "";
            default:
                break;
        }
        return "";
    }
    //Generate random password
    private String randomPassword(int passLength){
        
        //possible characters
        String passwordChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //fill char array with (passLength) number of Chars
        char[] password = new char[passLength];        
        
        //get random character from password & passwordChars (passLength) number of times
        for(int i = 0; i < passLength; i++){
            
            //randValue = random from passChars.length. cast to int
           int randValue = (int) (Math.random() * passwordChars.length());
           
           //add to password array a char from PasswordChars at (randValue) position
           password[i] = passwordChars.charAt(randValue);
        }
        return new String (password);
    }
    //Set mailbox capacity
    
    //Set alternate email address
    
    //Change password
}


