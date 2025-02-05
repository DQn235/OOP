/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuchanh_4_kethua;

import java.io.Serializable;
import java.util.*;

//tất cả các class cần lưu file phải có implements Serializable
public class Sinhvien implements Serializable{

    private String maSV, hoTen, ngaySinh, gioiTinh;
    private float diemTB;

    public Sinhvien() {
    }

    public Sinhvien(String maSV, String hoTen,
            String ngaySinh, String gioiTinh, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        maSV = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        diemTB = sc.nextFloat();

    }

    public void xuat() {
        System.out.printf("\n %20s  |  %20s  |  %20s  |  %20s  |  %10.2f  |",
                maSV, hoTen, ngaySinh, gioiTinh, diemTB);

//        System.out.printf("\n %5s", maSV);
//        System.out.printf("\n %15s", hoTen);
//        System.out.printf("\n %15s", ngaySinh);
//        System.out.printf("\n %4s", gioiTinh);
//        System.out.printf("\n %5.1f", diemTB);

    }

    @Override
    public String toString() {
        return "Sinhvien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ","
                + " ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemTB=" + diemTB + '}';
    }
}
