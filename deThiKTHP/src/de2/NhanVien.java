package de2;


public class NhanVien extends Person {

    protected String phongBan;
    protected Float heSoLuong;
    protected int thamNien;
    protected Float luong;

    public NhanVien() {
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public Float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }


    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, 
                    String phongBan, Float heSoLuong, int thamNien, Float luong) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luong = luong;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Phong ban: " + this.phongBan);
        System.out.println("He so luong: " + this.heSoLuong);
        System.out.println("Tham nien: " + this.thamNien);
        System.out.println("Luong: " + this.luong);
    }
    
    @Override
    public String toString() {
        return hoTen + "$" + ngaySinh + "$" + diaChi + "$" + gioiTinh 
                    + "$" + phongBan + "$" + heSoLuong + "$" + thamNien + "$" + luong;
    }

    public NhanVien(String s) {
        String result[] = s.split("\\$");

        hoTen = result[0];
        ngaySinh = result[1];
        diaChi = result[2];
        gioiTinh = result[3];
        phongBan = result[4];
        heSoLuong = Float.parseFloat(result[5]);
        thamNien = Integer.parseInt(result[6]);
        luong = Float.parseFloat(result[7]);
    }
    
    public Float tinhLuongTL() {
        return this.getLuong() * this.getHeSoLuong() * (1 + this.getThamNien() / 100);
    }

}
