package thuchanh5_giaodien;

import java.io.Serializable;

public class Student extends Person implements Serializable{
    String maSV, eMail;
    float diemTK;

    public Student() {
    }

    public Student(String maSV, String eMail, float diemTK,
            String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.eMail = eMail;
        this.diemTK = diemTK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public float getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(float diemTK) {
        this.diemTK = diemTK;
    }

    @Override
    public String toString() {
        return hoTen + "$" + ngaySinh + "$" + diaChi + "$" + gioiTinh + "$" + maSV + "$" + eMail + "$" + diemTK;
    }

    public Student(String s) {
        String result[] = s.split("\\$");
        
        hoTen = result[0];
        ngaySinh = result[1];
        diaChi = result[2];
        gioiTinh = result[3];
        maSV = result[4];
        eMail = result[5];
        diemTK = Float.parseFloat(result[6]);
        
    }
    
    @Override
    public void hienThi() {
        super.hienThi();
//        System.out.printf(" %20s  |  %20s  |  %20s  |",
//                maSV, eMail, diemTK);

        System.out.printf("\n Mã SV: %s", maSV);
        System.out.printf("\n Email: %s", ngaySinh);
        System.out.printf("\n Điểm TK: %.1f", diemTK);
    }
    
    
}
