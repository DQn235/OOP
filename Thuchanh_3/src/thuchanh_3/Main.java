/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        ArrayList<nhanVien> dsNV = new ArrayList<>();

//        String s1 = "Doan Van Quyen$23/05/2004$NamDinh$Nam$ATTT$2.5$5.0$10";
//        String s2 = "kkkkk$02/06/2000$NamDinh$Nam$ATTT$2.2$3.0$10";
//        String s3 = "Tran Van B$03/05/2002$NamDinh$Nam$ATTT$3.0$4.5$10";
//
//        nhanVien nv1 = new nhanVien(s1);
//        nhanVien nv2 = new nhanVien(s2);
//        nhanVien nv3 = new nhanVien(s3);
//
//        dsNV.add(nv1);
//        dsNV.add(nv2);
//        dsNV.add(nv3);
//
//        for (nhanVien nv : dsNV) {
//            nv.xuatNV();
//        }

       xuLyFile.luuFileDSNV(dsNV);
        
        int n;

        System.out.printf("\n Nhập số lượng nhân viên: ");
        n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            nhanVien nv = new nhanVien();
            nv.nhapNV();
            dsNV.add(nv);
        }   
        System.out.print("\n--------------------------\n  LƯU FILE XONG\n\n");
        dsNV=xuLyFile.readFileDSNV();
        
        for (nhanVien nv : dsNV) {
            nv.xuatNV();
        }
    }
}
