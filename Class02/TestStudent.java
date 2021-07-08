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
public class TestStudent {
    public static void main (String args[]) {
    Student stu= new Student(1, "Gấu","Bự", 500000);
    System.out.println(stu.getID());

    System.out.println(stu.getName());
    stu.setSalary(1000000);
    System.out.println(stu.getSalary());
    System.out.println(stu.raiseSalary(50));
    System.out.println(stu.toString());
    }
}
