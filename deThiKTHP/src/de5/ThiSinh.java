package de5;

import java.util.Scanner;

public class ThiSinh {
    String hoTen, ngaySinh, diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
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
    
    
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }
    
    public void hienThi() {
        System.out.printf("\n%15s  |  %15s  |  %15s  |", 
                hoTen, ngaySinh, diaChi);
    }
}
