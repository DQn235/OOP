/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3;

public class SinhVien {

    protected String maSV, hoTen, ngaySinh, gioiTinh;
    protected float diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen,
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

    public void hienThi() {
        System.out.printf("\n\n Ma SV: %2s", maSV);
        System.out.printf("\n Ho ten: %2s", hoTen);
        System.out.printf("\n Ngay sinh: %2s", ngaySinh);
        System.out.printf("\n Gioi tinh: %2s", gioiTinh);
        System.out.printf("\n Diem TB: %2.1f", diemTB);
    }
}
