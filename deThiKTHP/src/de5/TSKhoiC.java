package de5;

import java.util.Scanner;

public class TSKhoiC extends ThiSinh{
    Float van, su, dia;

    public TSKhoiC() {
    }

    public TSKhoiC(Float van, Float su, Float dia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public Float getVan() {
        return van;
    }

    public void setVan(Float van) {
        this.van = van;
    }

    public Float getSu() {
        return su;
    }

    public void setSu(Float su) {
        this.su = su;
    }

    public Float getDia() {
        return dia;
    }

    public void setDia(Float dia) {
        this.dia = dia;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập diem van: ");
        van = sc.nextFloat();
        System.out.println("Nhập diem su: ");
        su = sc.nextFloat();
        System.out.println("Nhập diem dia: ");
        dia = sc.nextFloat();
    }
    
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("  %3f  |  %3f  |  %3f  | \n", 
                van, su, dia);
    }
}
