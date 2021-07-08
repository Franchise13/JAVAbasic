/*
In ra hình sau

*

**

***

****

*****

N = 5

Yêu cầu : Nhập N từ bàn phím, và in ra cây như hình trên

 */
package Class02.BasicLoop1;

import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter N : ");
        n = sc.nextInt();
        
        for(int i = 0 ; i < n ; i++) {
            System.out.println("*");
            for(int j = 0; j <= i ;j++)
            System.out.print("*");       
        }
    }
}