Form tìm từ


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class form4 extends javax.swing.JFrame {

    KhoiTao tuDien = new KhoiTao();
    ArrayList<Word> danhSach;

    public form4() {
        initComponents();

        //Lấy danh sách đã khởi tạo
        danhSach = tuDien.getTuDien();
    }

            

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {                                           

        // Chuyển chuỗi sang chữ hoa
        String en = txtEN.getText().toUpperCase();

        //String vn = timKiemTuanTu(en);
        String vn = timKiemNhiPhan(en);

        if (vn != null) {
            txtVN.setText(vn);
        } //Ko tìm thấy từ thì bỗ sung vào danh sách
        else {
            ThemTu themTu = new ThemTu(this, rootPaneCheckingEnabled);
            themTu.setVisible(true);
        }

        //Ghi File
        try {
            File f = new File("dic.dat");
            PrintWriter pw = new PrintWriter(f);
            for (Word w : danhSach) {
                pw.printf("%s-%s-%s\n", w.getId(), w.getEn(), w.getVn());
            }

            pw.close();

            JOptionPane.showMessageDialog(null, "Luu du lieu thanh cong");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Luu file that bai");
            System.out.println(ex);
        }
    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //this.dispose();
    }                                        
             

    private String timKiemTuanTu(String en) {
        for (Word x : danhSach) {
            if (x.getEn().compareToIgnoreCase(en) == 0) { //tìm thấy
                return x.getVn();
            }
        }
        return null;
    }

    private String timKiemNhiPhan(String en) {
        Collections.sort(danhSach, new Comparator<Word>() {
            public int compare(Word w1, Word w2) {
                return w1.getEn().compareToIgnoreCase(w2.getEn());
            }
        });

        int left = 0;
        int right = this.danhSach.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            Word x = this.danhSach.get(mid);

            if (x.getEn().compareToIgnoreCase(en) == 0) {
                return x.getVn();
            } else if (x.getEn().compareToIgnoreCase(en) > 0) {
                right = mid - 1;
            } else {
                //mid = (left + right) / 2;
                left = mid + 1;
            }
        }
        return null;
    }

    public ArrayList<Word> getDanhSach() {
        return danhSach;
    }
}

Collections.sort(danhSach, new Comparator<HangHoa>() {
            public int compare(HangHoa h1, HangHoa h2) {
                return Double.compare(h1.getGia(), h2.getGia());
            }
        });

HangHoa hangHoaGiaCaoNhat = danhSach.get(danhSach.size() - 1);