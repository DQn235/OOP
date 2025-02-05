package de5;

import java.util.Scanner;


public class TSKhoiA extends ThiSinh{
    Float toan, ly, hoa;

    public TSKhoiA() {
    }

    public TSKhoiA(String hoTen, String ngaySinh, String diaChi, Float toan, Float ly, Float hoa) {
        super(hoTen, ngaySinh, diaChi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public Float getToan() {
        return toan;
    }

    public void setToan(Float toan) {
        this.toan = toan;
    }

    public Float getLy() {
        return ly;
    }

    public void setLy(Float ly) {
        this.ly = ly;
    }

    public Float getHoa() {
        return hoa;
    }

    public void setHoa(Float hoa) {
        this.hoa = hoa;
    }
    
    
    
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập diem toan: ");
        toan = sc.nextFloat();
        System.out.println("Nhập diem ly: ");
        ly = sc.nextFloat();
        System.out.println("Nhập diem hoa: ");
        hoa = sc.nextFloat();
    }
    
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("  %3f  |  %3f  |  %3f  | \n", 
                toan, ly, hoa);
    }
}
