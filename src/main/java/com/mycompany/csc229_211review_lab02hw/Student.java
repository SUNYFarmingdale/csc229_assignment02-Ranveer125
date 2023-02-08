package com.mycompany.csc229_211review_lab02hw;
//
///**
/*
 * @author MoaathAlrajab
 */
public class Student extends Person {
    
         private double GPA;         

    public double getGPA() {
        return GPA;
    }
/**
 * 
 * @param GPA gets the value /getter
 */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    /**
     * sets the value /setter
     */
    
         private String address;       
         
     // Instance variables for GPA and address

         public Student(String name, short age) {
             super(name, age);
             address="";
    }        
       // Constructor that will accept our parameters  
      
        public Student(String name, short age, double GPA, String address) {
        super(name, age);
        
        this.GPA = GPA;
        this.address = address;
    }
     
        
    @Override

    public String getAddress() {
        return address;
 
    }
    // Override Method for Implementation on Address

    @Override

    public void setAddress(String address) {
        this.address=address;

    }
	// ToDo 1: Make this class a child of Person
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code

}



