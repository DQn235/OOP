/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_2;

import java.util.*;
public class phieuPhong {
    Scanner sc = new Scanner(System.in);
    private String soPhieu;
    private phongHoc phongHocP;
    private String ngayLap, nguoiLap;
    private vatTu[] dsVattu;
    private int soVattu;

    public phieuPhong(String soPhieu, phongHoc phongHocP) {
        this.soPhieu = soPhieu;
        this.phongHocP = phongHocP;
    }

    public phieuPhong() {
    }

    public phongHoc getPhongHocP() {
        return phongHocP;
    }

    public void setPhongHocP(phongHoc phongHocP) {
        this.phongHocP = phongHocP;
    }
    
    
    
    public void nhapPhieu(){
        System.out.printf("\nNhập số phiếu: ");
        soPhieu=sc.nextLine();
        System.out.printf("\nNhập ngày lập: ");
        ngayLap=sc.nextLine();
        System.out.printf("\nNhập người lập: ");
        nguoiLap=sc.nextLine();
        
        phongHocP = new phongHoc();
        phongHocP.nhapPhong();
        
        System.out.printf("\nNhập số vật tư của phòng: ");
        soVattu = sc.nextInt();
        
        dsVattu = new vatTu[soVattu];
        for(int i=0;i<soVattu;i++){
            dsVattu[i]=new vatTu();
            dsVattu[i].nhapvatTu();
        }
    }
    
    public void inPhieu(){
        System.out.println("Số phiếu: "+ soPhieu);
        phongHocP.xuatPhong();
        System.out.println("Ngày lập: "+ ngayLap);
        
        for(int i=0;i<soVattu;i++){
            dsVattu[i].xuatVattu();
        }
        System.out.print("\nNgười lập: "+ nguoiLap);
        
    }
    
    public int tongSoluong(){
        int s=0;
        for(int i=0; i<soVattu; i++){
            s+= dsVattu[i].getSoLuong();
        }
        return s;
    }
    
    public float tongTien(){
        float sM=0;
        for(int i=0; i<soVattu; i++){
            sM+= dsVattu[i].cal();
        }
        return sM;
    } 

}
