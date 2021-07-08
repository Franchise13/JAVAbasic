/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class02;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class Student {
    private final int id;
    String firstName;
    private final String lastName;
    private int salary; 
    
    public Student(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getID() {
        return this.id;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    
    public int getSalary() {
        return this.salary;
    }
    
    public int getAnnualSalary() {
        return this.salary * 12;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int raiseSalary(int percent) {
        this.salary *= 1+ (double)percent/100;
        return this.salary;
    }
    
    @Override
    public String toString() {
        return "Employee[id: " +this.id
                + " Name: " + this.getName()
                + " Salary: " + this.salary + "]";  
    } 
}