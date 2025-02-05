/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author DoanQuyen
 */
public class xuLyFile {
    //Ghi dsach NV vào file
    public static void luuFileDSNV(ArrayList<nhanVien> dsNV)
    throws FileNotFoundException, IOException {
        File f = new File("dsNhanVien.dat");
        FileOutputStream fout =new FileOutputStream(f);
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(dsNV);
        out.close();
        fout.close();
    }
    
    //Đọc DSNV
    public static ArrayList<nhanVien> readFileDSNV()
    throws FileNotFoundException, IOException, ClassNotFoundException {
        File f = new File("dsNhanVien.dat");
        ArrayList<nhanVien> dsNV = new ArrayList<nhanVien>();
        FileInputStream fin =new FileInputStream(f);
        ObjectInputStream in=new ObjectInputStream(fin);
        
        dsNV=(ArrayList<nhanVien>)in.readObject();
        in.close();
        fin.close();
        return dsNV;
    }   
}