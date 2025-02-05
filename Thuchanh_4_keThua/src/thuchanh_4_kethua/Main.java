/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_4_kethua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
        DSSinhvien lst = new DSSinhvien();
        
        lst.nhapDS();
        //lst.luuFile();
        lst.luuFile_String();
        
        lst.xuatDS();
    }
}
