/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuchanh_2;

import java.util.Scanner;

public class vatTu {

    private String tenVattu;
    private String hangSxuat;
    private String nuocSxuat;
    private String ngayNhap;
    private int soLuong;
    private float donGia;

    public vatTu(String hangSxuat, String nuocSxuat, String ngayNhap, int soLuong, float donGia) {
        this.hangSxuat = hangSxuat;
        this.nuocSxuat = nuocSxuat;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public vatTu() {
    }

    public String getTenVattu() {
        return tenVattu;
    }

    public String getHangSxuat() {
        return hangSxuat;
    }

    public String getNuocSxuat() {
        return nuocSxuat;
    }

    public String getNgapNhap() {
        return ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setTenVattu(String tenVattu) {
        this.tenVattu = tenVattu;
    }

    public void setHangSxuat(String hangSxuat) {
        this.hangSxuat = hangSxuat;
    }

    public void setNuocSxuat(String nuocSxuat) {
        this.nuocSxuat = nuocSxuat;
    }

    public void setNgapNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void nhapvatTu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên vật tư: ");
        tenVattu = sc.nextLine();
        System.out.println("Nhập hãng SX");
        hangSxuat = sc.nextLine();
        System.out.println("Nhập nước SX");
        nuocSxuat = sc.nextLine();
        System.out.println("Nhập ngày nhập");
        ngayNhap = sc.nextLine();
        System.out.println("Nhập số lượng");
        soLuong = sc.nextInt();
        System.out.println("Nhập đơn giá");
        donGia = sc.nextFloat();

    }

    public void xuatVattu() {
        System.out.printf("\n %15s  |  %15s  |  %15s  |  %11s  |  %3d  |  %12.0f", tenVattu, hangSxuat, nuocSxuat, ngayNhap, soLuong, donGia);
    }

    public float cal() {
        return soLuong * donGia;
    }
}
