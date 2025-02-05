/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3;

public class SinhVienATTT extends SinhVien {

    private float hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(String maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB, float hocPhi) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    //Tên phương thức xuất lớp kế thừa phải giống lớp cơ sở
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("\n Hoc phi: %2.2f", hocPhi);
    }

    @Override
    public String toString() {
        return maSV + "$" + hoTen + "$" + ngaySinh + "$" + gioiTinh + "$" + diemTB + "$" + hocPhi;
    }

}
