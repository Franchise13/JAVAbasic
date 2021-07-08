/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class02.BasicLoop2;

import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class Ex1 {
        public static void main(String[] args) {
        Scanner Info = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = Info.nextLine();

        System.out.format(" Name: %s\n",name);
    }
}