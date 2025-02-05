/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_2;

import java.util.*;
class phongHoc {
    Scanner sc=new Scanner(System.in);
    private String soPhong, loaiPhong;
    private int tang;
    private float dienTich;

    public phongHoc(String soPhong, String loaiPhong, int tang, float dienTich) {
        this.soPhong = soPhong;
        this.loaiPhong = loaiPhong;
        this.tang = tang;
        this.dienTich = dienTich;
    }

    public phongHoc() {
    }

    public String getSoPhong() {
        return soPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public int getTang() {
        return tang;
    }

    public float getDienTich() {
        return dienTich;
    }
    
    
    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    

    
    public void nhapPhong(){
        System.out.printf("\nNhập số phòng: ");
        soPhong=sc.nextLine();
        System.out.printf("\nNhập loại phòng: ");
        loaiPhong=sc.nextLine();
        System.out.printf("\nNhập số tầng: ");
        tang=sc.nextInt();
        System.out.printf("\nNhập diện tích phòng: ");
        dienTich=sc.nextFloat();

    }
    
    public void xuatPhong(){
        System.out.println("Phong: " + soPhong + " Loại phòng: " + loaiPhong);
        System.out.println("Tầng: " + tang+ "Diện tích: " + dienTich);
    }
}
