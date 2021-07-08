/*
Nhap thong tin sinh vien gom cac thuoc tinh : Ten, tuoi, dia chi, email, so dien thoai. 
Va hien thi thong tin ra man hinh sau khi nhap.
 */
package Class01;

import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class Ur_Info {
    public static void main(String[] args) {
        Scanner Info = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = Info.nextLine();

        System.out.println("Please enter your address: ");
        String addr = Info.nextLine();

        System.out.println("Please enter your Email: ");
        String email = Info.nextLine();

        System.out.println("Please enter your phone number: ");
        int pnum = Integer.parseInt(Info.nextLine());

        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(Info.nextLine());

        System.out.format(" Name: %s\n Address: %s\n Email: %s\n Phone Number: %d\n Age: %d",name,addr,email,pnum,age);
    }
}