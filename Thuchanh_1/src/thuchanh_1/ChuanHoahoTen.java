
package thuchanh_1;

import java.util.Scanner;

public class ChuanHoahoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Nhập Họ tên: ");
        String hoTen = sc.nextLine();
        
        //Xóa khoảng trắng đầu cuối
        hoTen = hoTen.trim();

        hoTen = hoTen.replaceAll("\\s{2,}"," ");

        System.out.print(Character.toUpperCase(hoTen.charAt(0)));
        for(int i = 1 ; i< hoTen.length(); i ++)
        {
            if(hoTen.charAt(i)==' ' && hoTen.charAt(i+1)!=' ') {
                System.out.print(" " + Character.toUpperCase(hoTen.charAt(i+1)));
                i++;
            }
            else System.out.print(hoTen.charAt(i));
        }
    }
}
