/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_4_kethua;

import java.io.*;
import java.util.*;

/**
 *
 * @author DoanQuyen
 */
public class xuLyFile {
    //Ghi dsSV vào file
    public static void ghiFileDSSV(ArrayList<Sinhvien> dsSV)
    throws FileNotFoundException, IOException {
        File f = new File("Sinhvien.dat");
        FileOutputStream fout =new FileOutputStream(f);
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(dsSV);
        out.close();
        fout.close();
    }
    
    //Đọc DSNV
    public static ArrayList<Sinhvien> docFileDSNV()
    throws FileNotFoundException, IOException, ClassNotFoundException {
        File f = new File("Sinhvien.dat");
        ArrayList<Sinhvien> dsSV = new ArrayList<Sinhvien>();
        FileInputStream fin =new FileInputStream(f);
        ObjectInputStream in=new ObjectInputStream(fin);
        dsSV=(ArrayList<Sinhvien>)in.readObject();
        in.close();
        fin.close();
        return dsSV;
    } 
    
}
