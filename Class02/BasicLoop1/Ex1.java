/*
Khai báo mảng số nguyên gồm 10 phần tử.

Yêu cầu :

- Nhập giá trị cho mảng đó

- Tính tổng giá trị các phần tử trong mảng và in ra màn hình
 */
package Class02.BasicLoop1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class Ex1 {
    public static void main(String[] args) {
        int tmp, num;
        num = 0;
        for (int i = 1; i <= 10; i++){
            tmp = num_of_Ex1(i);
            num += tmp;
        }
        int sum;
        sum = (int) num++;
        DecimalFormat df = new DecimalFormat();
        System.out.println("The sum of the number is: " + df.format(sum));
    }
    
    public static int num_of_Ex1(int num){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter random integer number for number " + num + ": ");
        int result;
        result = sc.nextInt();
        return result;
    }
}
