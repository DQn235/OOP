package de3;

public class SinhVienMatMa extends SinhVien {

    protected String donVi;
    protected float luong;

    public SinhVienMatMa() {
    }

    public SinhVienMatMa(String maSV, String hoTen, String ngaySinh, String gioiTinh,
             float diemTB, String donVi, float luong) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }


    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("\n Học phí: %2s", donVi);
        System.out.printf("\n Lương: %2.2f ", luong);
    }
    
    @Override
    public String toString() {
        return maSV + "$" + hoTen + "$" + ngaySinh + "$" + gioiTinh + "$" + diemTB + "$" + donVi + "$" + luong;
    }
}
