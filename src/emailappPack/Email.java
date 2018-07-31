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

    
    //Constructors
    //getting first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New email created: " + this.firstName + " " + this.lastName);
        
        
        //getDepartment
        this.department = setDepartment();
        System.out.println("Select Department Number: " + this.department);
        
    }
    
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
                return "N/A";
            default:
                break;
        }
        return null;
    }
    //Generate random password
    
    //Set mailbox capacity
    
    //Set alternate email address
    
    //Change password
}


