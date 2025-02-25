/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thuchanh5_giaodien;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DoanQuyen
 */
public class nhapthongTin extends javax.swing.JFrame {

    /**
     * Creates new form nhapthongTin
     */
    public nhapthongTin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnThemSinhVien = new javax.swing.JButton();
        txtHoTen = new javax.swing.JTextField();
        btnLuuDuLieu = new javax.swing.JButton();
        btnDocDuLieu = new javax.swing.JButton();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtMaSV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        txtDiemTK = new javax.swing.JTextField();
        btnDocDuLieu2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSinhVien = new javax.swing.JTextArea();
        btnResetFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhập thông tin sinh viên");

        jLabel2.setText("Họ tên:");

        jLabel3.setText("Ngày sinh:");

        jLabel4.setText("Giới tính:");

        jLabel5.setText("Địa chỉ:");

        jLabel6.setText("Mã SV:");

        jLabel7.setText("Email:");

        jLabel8.setText("Điểm TK:");

        btnThemSinhVien.setText("Thêm Sinh viên");
        btnThemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSinhVienActionPerformed(evt);
            }
        });

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        btnLuuDuLieu.setText("Lưu dữ liệu");
        btnLuuDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuDuLieuActionPerformed(evt);
            }
        });

        btnDocDuLieu.setText("Đọc dữ liệu");
        btnDocDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocDuLieuActionPerformed(evt);
            }
        });

        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        txtMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSVActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGioiTinhActionPerformed(evt);
            }
        });

        txtDiemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiemTKActionPerformed(evt);
            }
        });

        btnDocDuLieu2.setText("Đọc DL và hiện Form");
        btnDocDuLieu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocDuLieu2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Thông tin sinh viên");

        jButton5.setText("Làm mới");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtAreaSinhVien.setColumns(20);
        txtAreaSinhVien.setRows(5);
        jScrollPane1.setViewportView(txtAreaSinhVien);

        btnResetFile.setText("Reset File");
        btnResetFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(24, 24, 24)
                                .addComponent(txtDiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDocDuLieu2)
                                    .addComponent(btnResetFile))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThemSinhVien)
                                .addGap(18, 18, 18)
                                .addComponent(btnLuuDuLieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDocDuLieu)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSinhVien)
                    .addComponent(btnLuuDuLieu)
                    .addComponent(btnDocDuLieu)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDocDuLieu2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResetFile))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnThemSinhVien.getAccessibleContext().setAccessibleName("OK");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSinhVienActionPerformed

        //Tạo đối tượng lấy từ Form
        Student x = new Student(txtMaSV.getText(), txtEmail.getText(), Float.parseFloat(txtDiemTK.getText()),
                txtHoTen.getText(), txtNgaySinh.getText(), txtDiaChi.getText(), txtGioiTinh.getText());

        //Hiển thị ra màn hình console
        x.hienThi();

    }//GEN-LAST:event_btnThemSinhVienActionPerformed

    private void btnLuuDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuDuLieuActionPerformed
        //Lấy thông tin sinh viên từ Form và lưu vào file

//        try {
//            FileOutputStream fos = new FileOutputStream("sinhvien.dat");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
////            Student x = new Student(txtHoTen.getText());
////            x.setHoTen(txtHoTen.getText());
////            x.setNgaySinh(txtNgaySinh.getText());
////            x.setDiaChi(txtDiaChi.getText());
////            x.setGioiTinh(txtGioiTinh.getText());
////            x.setMaSV(txtMaSV.getText());
////            x.seteMail(txtEmail.getText());
////            x.setDiemTK(Float.parseFloat(txtDiemTK.getText()));
//
//            Student x = new Student(txtMaSV.getText(), txtEmail.getText(), Float.parseFloat(txtDiemTK.getText()),
//                    txtHoTen.getText(), txtNgaySinh.getText(), txtDiaChi.getText(), txtGioiTinh.getText());
//            oos.writeObject(x);
//            
//            
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(nhapthongTin.class.getName());
//        } catch (IOException ex) {
//            Logger.getLogger(nhapthongTin.class.getName());
//        }
        Student x = new Student(txtMaSV.getText(), txtEmail.getText(), Float.parseFloat(txtDiemTK.getText()),
                txtHoTen.getText(), txtNgaySinh.getText(), txtDiaChi.getText(), txtGioiTinh.getText());

        try {
            File f = new File("sinhvien.dat");

            // Tạo FileWriter để ghi dữ liệu vào một tệp với chế độ append (true/false) 
            // true - Thêm dữ liệu vào cuối file mà không làm mất dữ liệu cũ
            // false - Dữ liệu mỗi lần mở file sẽ bị ghi đè
            FileWriter fw = new FileWriter(f, true);

            fw.write(x.toString() + "\n");

            fw.close();

            System.out.println("Ghi File thanh cong");
        } catch (IOException ex) {
            System.out.println("Loi ghi File: " + ex);
        }
    }//GEN-LAST:event_btnLuuDuLieuActionPerformed

    private void btnDocDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocDuLieuActionPerformed
        // TODO add your handling code here:

//        try {
//            FileInputStream fis = new FileInputStream("sinhvien.dat");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//
//            Student x = (Student) ois.readObject();  // Đọc đối tượng Student từ file
//            
//            //Hiển thị ra màn hình console
//            //Ở đây hiện 1 sinh viên mỗi lần nhấn nút 
//            x.hienThi();
//
//            ois.close();
//            fis.close();
//
//        } catch (Exception ex) {
//            System.out.println("Loi doc file" + ex);
//        }
        try {
            //Buớc 1: Tao dối tượng luồng và liên kết nguồn dữ liệu  
            File f = new File("sinhvien.dat");
            FileReader fr = new FileReader(f);

            //Bước 2: Đọc dữ liệu  
            BufferedReader br = new BufferedReader(fr);

            String line;
            StringBuilder sb = new StringBuilder();

            // Đọc từng dòng dữ liệu trong file
            while ((line = br.readLine()) != null) {
                
                // Tạo đối tượng Student và append vào StringBuilder
                Student x = new Student(line.trim());
                sb.append(x.toString()).append("\n");

            }

            //Buớc 3: Dóng luổng  
            fr.close();
            br.close();

            // Hiển thị danh sách nhân viên dạng text 
            txtAreaSinhVien.setText(sb.toString());
            System.out.println("Doc file thanh cong!");
            
        } catch (IOException ex) {
            System.out.println("In Loi doc file: " + ex);
        }
    }//GEN-LAST:event_btnDocDuLieuActionPerformed

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void btnDocDuLieu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocDuLieu2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("sinhvien.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student x = (Student) ois.readObject();

            txtHoTen.setText(x.getHoTen());
            txtNgaySinh.setText(x.getNgaySinh());
            txtDiaChi.setText(x.getDiaChi());
            txtMaSV.setText(x.getMaSV());
            txtEmail.setText(x.geteMail());
            txtGioiTinh.setText(x.getGioiTinh());
            txtDiemTK.setText(String.valueOf(x.getDiemTK()));

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Không tìm thấy lớp Student: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Dữ liệu bị null: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Có lỗi xảy ra: " + e.getMessage());
        }

    }//GEN-LAST:event_btnDocDuLieu2ActionPerformed

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGioiTinhActionPerformed

    private void txtMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSVActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDiemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiemTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiemTKActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        // Xóa nội dung các textfield
        // Đặt lại các chuỗi là rỗng
        txtHoTen.setText("");
        txtNgaySinh.setText("");
        txtDiaChi.setText("");
        txtGioiTinh.setText("");
        txtMaSV.setText("");
        txtEmail.setText("");
        txtDiemTK.setText("");

        //this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnResetFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetFileActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            File f = new File("sinhvien.dat");
            PrintWriter writer = new PrintWriter(f);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(nhapthongTin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnResetFileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nhapthongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhapthongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhapthongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhapthongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nhapthongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocDuLieu;
    private javax.swing.JButton btnDocDuLieu2;
    private javax.swing.JButton btnLuuDuLieu;
    private javax.swing.JButton btnResetFile;
    private javax.swing.JButton btnThemSinhVien;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaSinhVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDiemTK;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables
}
