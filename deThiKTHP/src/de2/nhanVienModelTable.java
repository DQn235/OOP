/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class nhanVienModelTable extends AbstractTableModel{

    private final ArrayList<NhanVien> dsNV;
    private final String[] columnName
            = new String[]{"Ho Ten", "Ngay sinh", "Dia chi", "Gioi Tinh", "Phong ban", 
                                " HS Luong", "Tham nien", "LuongCB", "Luong"};

    public nhanVienModelTable(ArrayList<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        NhanVien x = dsNV.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return x.getHoTen();
            case 1:
                return x.getNgaySinh();
            case 2:
                return x.getDiaChi();
            case 3:
                return x.getGioiTinh();
            case 4:
                return x.getPhongBan();
            case 5:
                return x.getHeSoLuong();
            case 6:
                return x.getThamNien();
            case 7:
                return x.getLuong();
            case 8:
                return x.tinhLuongTL();
            default:
                break;
        }
        return x;
    }

    @Override
    public int getRowCount() {
        return dsNV.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }

    public void addRow(NhanVien nv) {
        dsNV.add(nv);
        fireTableRowsInserted(dsNV.size() - 1, dsNV.size() - 1);
    }

    public void clear() {
        dsNV.clear();
        fireTableDataChanged();
    }
}
