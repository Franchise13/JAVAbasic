/*
Khai báo mảng số nguyên gồm N phần tử (N nhập từ bàn phím)

Yêu cầu :

- Nhập dữ liệu cho mảng trên

- Tính tổng các phần tử chia hết cho 3 trong mảng và in ra màn hình kết quả.
 */
package Class02.BasicLoop1;

import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter N array: ");
        n = sc.nextInt();
        
        int[] arr =  new int[n];
        for(int i = 0 ; i < n ; i++) {
            System.out.println("\nInsert value for array  ");
            arr[i]= sc.nextInt();
        }
        
        int sum = 0;
        for( int i = 0 ; i < n ; i++){
            if(arr[i]%3==0){
            sum = sum + arr[i];
            }
        }
        System.out.println("The sum of the number divisible by 3 in the array is: " +sum);
    }
}