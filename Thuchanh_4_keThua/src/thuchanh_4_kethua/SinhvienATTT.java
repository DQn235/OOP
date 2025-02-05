/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_4_kethua;

import java.io.Serializable;
import java.util.Scanner;


public class SinhvienATTT extends Sinhvien
                            implements Serializable{
    private float hocPhi;

    public SinhvienATTT() {
    }

    public SinhvienATTT(String maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB, float hocPhi) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi=hocPhi;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập học phí: ");
        hocPhi=sc.nextFloat();
    }
    
    //Tên phương thức xuất lớp kế thừa phải giống lớp cơ sở
    
    public void xuat(){
        super.xuat();
        System.out.printf("  %5.2f  |", hocPhi);
    }
    
    
}
