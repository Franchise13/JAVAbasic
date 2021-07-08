/*
Nhap so nguyen x, in ra x la so chan hay so le
 */
package Class01;
import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class OddAndEvenX {
    public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    
    System.out.println("Enter x:");
    int x = n.nextInt();
    
    if (x % 2 == 0){
    System.out.println("x is the even ");
    } else {
        System.out.println("x is the odd");
        }
    }
}
