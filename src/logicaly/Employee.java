package Logicaly;

import java.util.Arrays;
import java.util.regex.Pattern;

// Employee class

public class Employee {
	
// An employee object has the following private attributes: 
	
	private int ID;
    private String employeeNum;
    private String fullName;
    private String Title;
    private String Department;
    private String phoneNumber;
    private String emailAddress;
    
//  Define the getter for ID
    
    public int getID() {
        return ID;
    }
    
//  Define the setter for ID
    
    public void setID(int ID) {
        this.ID = ID;
    }

//  Define the getter for Employee Number    
    
    public String getEmployeeNum() {
        return employeeNum;
    }

//  Define the setter for Employee Number  
    
    public void setEmployeeNum(String employeeNum) throws InvalidEmployeeDetailException {
        if(Pattern.matches("E01[0-9]{2}", employeeNum)) {
            this.employeeNum = employeeNum;
        }
        else {
            throw new InvalidEmployeeDetailException("Invalid Employee Number");
        }
    }
    
//  Define the getter for Full name 
    
    public String getFullName() {
        return fullName;
    }

//  Define the setter for Full name 
    
    public void setFullName(String fullName) throws InvalidEmployeeDetailException {
        if(Pattern.matches("[a-zA-z]{3,10}\\s[a-zA-z]{3,10}", fullName)) {
            this.fullName = fullName;
        }
        else {
            throw new InvalidEmployeeDetailException("Invalid Employee Full Name");
        }
    }

//  Define the getter for Title 
    
    public String getTitle() {
        return Title;
    }

//  Define the setter for Title 
    
    public void setTitle(String title) throws InvalidEmployeeDetailException {
        if(Arrays.asList(new String[]{"Director", "Manager", "Assistant", "Supervisor", "Trainee"}).contains(title)) {
            this.Title = title;
        }
        else {
            throw new InvalidEmployeeDetailException("Invalid Employee Title");
        }
    }

//  Define the getter for Department 
    
    public String getDepartment() {
        return Department;
    }

//  Define the setter for Department 
    
    public void setDepartment(String department) throws InvalidEmployeeDetailException {
        if(Arrays.asList(new String[]{"IT", "Sales", "R&D", "Prod", "HR"}).contains(department)) {
            Department = department;
        }
        else {
            throw new InvalidEmployeeDetailException("Invalid Employee Department");
        }
    }
    
//  Define the getter for Phone number

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
//  Define the setter for Phone number   

    public void setPhoneNumber(String phoneNumber) throws InvalidEmployeeDetailException {
        if(Pattern.matches("[0][6,7][5,6,7,9,0][0-9]{7}", phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
        else {
            throw new InvalidEmployeeDetailException("Invalid Employee Phone Number");
        }
    }

//  Define the getter for Email address    
    
    public String getEmailAddress() {
        return emailAddress;
    }

//  Define the setter for Email address  
    
    public void setEmailAddress(String emailAddress) throws InvalidEmployeeDetailException {
        if(Pattern.matches("[a-zA-Z]{1,2}[.][a-zA-Z]{3,10}@logicaly.net", emailAddress)) {
            this.emailAddress = emailAddress;
        }
        else {
            throw new InvalidEmployeeDetailException("Invalid Employee Email Address");
        }
    }
}