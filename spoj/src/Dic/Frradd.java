Form Thêm từ (Tạo dialog)



import javax.swing.JOptionPane;

public class ThemTu extends java.awt.Dialog {

    form4 form4;

    public ThemTu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        form4 = (form4) parent;
    }

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

//        Word tuMoi = new Word();
//        tuMoi.setId(Integer.parseInt(txtID.getText()));
//        tuMoi.setEn(txtEN.getText());
//        tuMoi.setVn(txtVN.getText());
//
//        form4.getDanhSach().add(tuMoi);
        
        Word tuMoi = new Word(Integer.parseInt(txtID.getText()), txtEN.getText(), txtVN.getText());
        form4.getDanhSach().add(tuMoi);

        JOptionPane.showMessageDialog(form4, "Thêm từ Thành công");
    }

