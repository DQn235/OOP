/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuchanh_1;

import java.util.Scanner;
public class TongBinhphuong {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n, t=0;
        System.out.printf("Nhập n: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            t+=i*i;
        }
        System.out.printf("\nTổng 1^2+2^2+...+%d^2 = %d", n, t);

    }
    
}
