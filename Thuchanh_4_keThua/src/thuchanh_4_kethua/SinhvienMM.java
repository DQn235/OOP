/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_4_kethua;

import java.io.Serializable;
import java.util.*;

public class SinhvienMM extends Sinhvien implements Serializable{
    private String donVi;
    private float luong;

    public SinhvienMM() {
    }

    public SinhvienMM(String maSV, String hoTen, String ngaySinh, String gioiTinh
            , float diemTB, String donVi, float luong) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi=donVi;
        this.luong=luong;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập đơn vị: ");
        donVi=sc.nextLine();
        System.out.println("Nhập lương: ");
        luong=sc.nextFloat();
    }
    
    public void xuat(){
        super.xuat();
        System.out.printf("  %15s  |  %5.2f  |", donVi, luong);

//        System.out.printf("  Học phí: %15s  |", donVi);
//        System.out.printf("  Lương: %5.2f  |", luong);
    }
}
