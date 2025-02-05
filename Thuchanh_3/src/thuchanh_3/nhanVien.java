/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuchanh_3;

import java.io.Serializable;

import java.util.Scanner;
public class nhanVien implements Serializable {
     String hoTen, ngaySinh, diaChi, gioiTinh, phongBan;
     float hsLuong, thamNien;
     static float luongCB = 10;

    public nhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String phongBan, float hsLuong, float thamNien) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.phongBan = phongBan;
        this.hsLuong = hsLuong;
        this.thamNien = thamNien;
    }

    public nhanVien() {
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHsLuong() {
        return hsLuong;
    }

    public void setHsLuong(float hsLuong) {
        this.hsLuong = hsLuong;
    }

    public float getThamNien() {
        return thamNien;
    }

    public void setThamNien(float thamNien) {
        this.thamNien = thamNien;
    }

    public static float getLuongCB() {
        return luongCB;
    }

    public static void setLuongCB(float luongCB) {
        nhanVien.luongCB = luongCB;
    }
    
    
    public nhanVien(String s) {
        String result[] = s.split("\\$");
        hoTen = result[0];
        ngaySinh = result[1];
        diaChi = result[2];
        gioiTinh = result[3];
        phongBan = result[4];
        hsLuong = Float.parseFloat(result[5]);
        thamNien = Float.parseFloat(result[6]);
        luongCB=Float.parseFloat(result[7]);
    }

    public void nhapNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhập phòng ban: ");
        phongBan = sc.nextLine();
        System.out.println("Nhập hệ số lương: ");
        hsLuong = sc.nextFloat();
        System.out.println("Nhập thâm niên: ");
        thamNien = sc.nextFloat();
        System.out.println("Nhập lương cơ bản: ");
        luongCB = sc.nextFloat();
        
        
    }

    
    public void xuatNV() {
        System.out.printf("\n %20s  |  %20s  |  %20s  |  %20s  |  %20s  |  %10.2f  |  %10.2f  |  %10.2f  |  %10.2f", 
                hoTen, ngaySinh, diaChi, gioiTinh, phongBan, hsLuong, thamNien, luongCB, tinhLuong());
    }
    
    public float tinhLuong(){
        return luongCB* hsLuong*(1+thamNien/100);
    }
}