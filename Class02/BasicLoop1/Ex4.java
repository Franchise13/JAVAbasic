/*
Cho biểu thức Fibonaci như sau

F(0) = 1

F(1) = 1

F(n) = F(n-1) + F(n-2)

Nhập từ bản phím số max. In ra tất cả các số Fibonaci có giá trị nhỏ hơn max.
 */

package Class02.BasicLoop1;

import java.util.Scanner;

/**
 *
 * @author Khoa Pham
 */
public class Ex4 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Nhap n : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i= 0 ; i <n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int tmp;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                if(arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+", ");
        }
    }
}