/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuchanh5_giaodien;

import java.io.Serializable;

public class Person implements Serializable{


    String hoTen, ngaySinh, diaChi, gioiTinh;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, 
            String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
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

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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

    public void hienThi() {
//        System.out.printf("\n %20s  |  %20s  |  %20s  |  %20s  |",
//                hoTen, ngaySinh, diaChi, gioiTinh);

        System.out.printf("\n\n Họ tên: %s", hoTen);
        System.out.printf("\n Ngày sinh: %s", ngaySinh);
        System.out.printf("\n Địa chỉ: %s", diaChi);
        System.out.printf("\n Giới tính: %s", gioiTinh);
    }
    
}
