/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_1;

import java.util.Scanner;
public class ChuSolonnhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        str=sc.nextLine();
        //sc.nextLine();
        char M=str.charAt(0);
        for(int i=1;i<str.length(); i++){
            if(str.charAt(i) > M){
                M=str.charAt(i);
            }
        }
        System.out.printf("Chữ số lớn nhất là %s", M);
    }

}
