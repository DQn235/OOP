/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_4_kethua;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class DSSinhvien {

    Scanner sc = new Scanner(System.in);
    ArrayList<Sinhvien> dsSV = new ArrayList<>();
    //ArrayList<Sinhvien> dsSV;

    //nhapDS thể hiện tính đa hình của kế thừa
    public void nhapDS() {

        int n;
        System.out.printf("\n Nhập số sinh viên ATTT: ");
        n = sc.nextInt();
        //dsSV = new ArrayList<Sinhvien>();
        for (int i = 0; i < n; i++) {
            SinhvienATTT s = new SinhvienATTT();
            s.nhap();
            dsSV.add(s);
        }

        int m;
        System.out.printf("\n Nhập số sinh viên mật mã: ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            SinhvienMM s = new SinhvienMM();
            s.nhap();
            dsSV.add(s);
        }
    }

    public void xuatDS() {

        System.out.printf("\n DSSV ");
        for (Sinhvien s : dsSV) {
            s.xuat();
        }
    }

    //Ghi dsach SV vào file
    public void luuFile()
            throws FileNotFoundException, IOException {

        //B1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
        FileOutputStream fout = new FileOutputStream("Sinhvien.dat");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        
        //B2: Ghi mảng/Danhsach đối tượng vào file
        out.writeObject(dsSV);
        
        //B3: Đóng luồng
        fout.close();
        out.close();
        System.out.println("\n Ghi file THÀNH CÔNG");

    }
    
    //Ghi dsach vào file bằng toString
    public void luuFile_String()
            throws IOException {

        //B1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
        File f = new File("Sinhvien.dat");
        FileWriter fw = new FileWriter(f);
        
        //B2: Ghi mảng/Danhsach đối tượng vào file
        for(Sinhvien x: dsSV){
            fw.write(x.toString() + "\n");
        }
        
        //B3: Đóng luồng
        fw.close();
        
        System.out.println("\n Ghi file THÀNH CÔNG");

    }

}
