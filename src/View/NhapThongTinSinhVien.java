/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConnectionSQL;
import Model.SinhVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author DELL
 */
public class NhapThongTinSinhVien extends javax.swing.JFrame {

    private ArrayList<SinhVien> list;
    DefaultTableModel model;

    /**
     * Creates new form NhapThongTinSinhVien
     */
    public NhapThongTinSinhVien() {
        initComponents();
        setLocationRelativeTo(null);

        list = new ConnectionSQL().getListStudent();
        model = (DefaultTableModel) tblSinhVien.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sinh viên", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Mã lớp"
        });

        showTable();
    }

    public void showTable() {
        model.setRowCount(0);
        for (SinhVien s : list) {
            model.addRow(new Object[]{
                s.getMaSV(), s.getHoTen(), s.getNgaySinh(), s.getGioiTinh(), s.getDiaChi(), s.getMaLop()
            });
        }
    }

    private void showSinhVien() {
        list = new ConnectionSQL().getListStudent();
        model.setRowCount(0);

        for (SinhVien sv : list) {
            model.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getNgaySinh(),
                sv.getGioiTinh(), sv.getDiaChi(), sv.getMaLop()
            });
        }
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgGT = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfMaSV = new javax.swing.JTextField();
        jtfHoTen = new javax.swing.JTextField();
        jtfNgaySinh = new javax.swing.JTextField();
        jtfDiaChi = new javax.swing.JTextField();
        jrbNam = new javax.swing.JRadioButton();
        jrbNu = new javax.swing.JRadioButton();
        jbtNhap = new javax.swing.JButton();
        jbtThem = new javax.swing.JButton();
        jbtSua = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();
        jbtTim = new javax.swing.JButton();
        jbtThoat = new javax.swing.JButton();
        jcbMaLop = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông tin sinh viên");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("THÔNG TIN SINH VIÊN");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhập thông tin"));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ và tên");

        jLabel4.setText("Ngày sinh");

        jLabel5.setText("Giới tính");

        jLabel6.setText("Địa chỉ");

        jLabel7.setText("Mã lớp");

        jbgGT.add(jrbNam);
        jrbNam.setSelected(true);
        jrbNam.setText("Nam");

        jbgGT.add(jrbNu);
        jrbNu.setText("Nữ");

        jbtNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        jbtNhap.setText("Nhập");
        jbtNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNhapActionPerformed(evt);
            }
        });

        jbtThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        jbtThem.setText("Thêm");
        jbtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemActionPerformed(evt);
            }
        });

        jbtSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit.png"))); // NOI18N
        jbtSua.setText("Sửa");
        jbtSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaActionPerformed(evt);
            }
        });

        jbtXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        jbtXoa.setText("Xóa");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });

        jbtTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search.png"))); // NOI18N
        jbtTim.setText("Tìm");
        jbtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimActionPerformed(evt);
            }
        });

        jbtThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit.png"))); // NOI18N
        jbtThoat.setText("Thoát");
        jbtThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThoatActionPerformed(evt);
            }
        });

        jcbMaLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jcbMaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMaLopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbNam)
                                .addGap(44, 44, 44)
                                .addComponent(jrbNu))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbMaLop, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbNam)
                            .addComponent(jrbNu)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jcbMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNhap)
                    .addComponent(jbtThem)
                    .addComponent(jbtSua))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtXoa)
                    .addComponent(jbtThoat)
                    .addComponent(jbtTim))
                .addGap(120, 120, 120))
        );

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(310, 310, 310))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemActionPerformed
        // TODO add your handling code here:
   try{
            String x = "";
            if (jrbNam.isSelected()) {
                x = "Nam";
            } else {
                x = "Nu";
            }
            SinhVien s = new SinhVien();
            s.setMaSV(jtfMaSV.getText());
            s.setHoTen(jtfHoTen.getText());
            s.setNgaySinh(jtfNgaySinh.getText());
            s.setGioiTinh(x);
            s.setDiaChi(jtfDiaChi.getText());
            s.setMaLop(jcbMaLop.getSelectedItem().toString());
             list.add(s);
            new ConnectionSQL().themSV(s);
            
               
                //JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                showSinhVien();
            
        } catch (Exception ex) {
            Logger.getLogger(NhapThongTinSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            

    }//GEN-LAST:event_jbtThemActionPerformed

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        // TODO add your handling code here:
        try {
             int selectedIndex = tblSinhVien.getSelectedRow();// ptu nào đang đc chọn
        if (selectedIndex > 0) {
            SinhVien sv = list.get(selectedIndex);
            
            int luachon = JOptionPane.showConfirmDialog(this, "Bạn có muốn XÓA không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
            if (luachon == JOptionPane.YES_OPTION) {
                //gọi cái hàm xóa ra// gọi hàm xóa với mã SV
                new ConnectionSQL().deleteStudent(sv.getMaSV());
                JOptionPane.showMessageDialog(null, "Đã XÓA thành công!");
                //khi xóa xong gọi lại
                showSinhVien();
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_jbtXoaActionPerformed

    private void resetText(){
        jtfMaSV.setText("");
        jtfHoTen.setText("");
        jtfDiaChi.setText("");
        jtfNgaySinh.setText("");
        jtfMaSV.requestFocus();
        jrbNam.setSelected(true);
        jcbMaLop.setSelectedIndex(0);
   }
    private void jbtNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNhapActionPerformed
        // TODO add your handling code here:
        resetText();
    }//GEN-LAST:event_jbtNhapActionPerformed

    private void jbtThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThoatActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (a== JOptionPane.YES_OPTION) {
            new Menu_TaiKhoan_GV().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtThoatActionPerformed

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        // TODO add your handling code here:
        try {
            int selectdedRow = tblSinhVien.getSelectedRow();
            if (selectdedRow >= 0) {
                String maSV = (String) tblSinhVien.getValueAt(selectdedRow, 0);
                for (SinhVien sv : list) {
                    if(maSV.equals(sv.getMaSV())){
                        jtfMaSV.setText(maSV.trim());
                        jtfHoTen.setText(sv.getHoTen());
                        jtfNgaySinh.setText(sv.getNgaySinh());
                        if (sv.getGioiTinh().equals("Nam"))
                            jrbNam.setSelected(true);
                        else
                            jrbNu.setSelected(true);
                        
                        
                        jtfDiaChi.setText(sv.getDiaChi());                                            
                        jcbMaLop.setSelectedItem(sv.getMaLop().trim());
                        break;
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void jcbMaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMaLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMaLopActionPerformed

    private void jbtSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();

        if (jtfMaSV.getText().isEmpty() || jtfHoTen.getText().isEmpty() || 
                jtfNgaySinh.getText().isEmpty() || jtfDiaChi.getText().isEmpty()) {
            sb.append("Bạn không được để trống các ô nhập liệu!");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb.toString(), "Thông Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
         int chon = JOptionPane.showConfirmDialog(null, "Bạn có muốn Cập Nhật không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (chon == JOptionPane.NO_OPTION) {
            // nếu chọn NO kết thúc sự thực hiện PThuc
            //-> nhờ lệnh
            return;
        }
        try {
            String maSV = jtfMaSV.getText().trim();
            String hoTen = jtfHoTen.getText().trim();
            String ngaySinh = jtfNgaySinh.getText().trim();
            String x = "";
            if (jrbNam.isSelected())
                x="Nam";
            else
                x="Nu";
            String diaChi = jtfDiaChi.getText().trim();
            String maLop = jcbMaLop.getSelectedItem().toString();
            SinhVien sv = new SinhVien(maSV,hoTen,ngaySinh,diaChi,x,maLop);
            if( new ConnectionSQL().update(sv)){
              JOptionPane.showMessageDialog(null, "Cập nhật Thành Công!");
            }else{
             JOptionPane.showMessageDialog(null, "Lỗi không được đổi MÃ!");  
            }  
            //Sau khi thêm load lại bảng để hiển thị
            resetText();
            showSinhVien();
        } catch (Exception e) {
            e.printStackTrace();
           
        }
    
   
    }//GEN-LAST:event_jbtSuaActionPerformed

    private void jbtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimActionPerformed
        // TODO add your handling code here:
         String maCTim = JOptionPane.showInputDialog(this, "Nhập Tìm Kiếm");
         
        if (maCTim != null && maCTim.length() > 0) {
            list =(ArrayList<SinhVien>) new ConnectionSQL().findByMa(maCTim);

            model.setRowCount(0);

            for (SinhVien sv : list) {
                model.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getNgaySinh(),
                    sv.getGioiTinh(), sv.getDiaChi(), sv.getMaLop()
                });
            }
        }else{
            showSinhVien();
        }
    }//GEN-LAST:event_jbtTimActionPerformed

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
            java.util.logging.Logger.getLogger(NhapThongTinSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapThongTinSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapThongTinSinhVien().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jbgGT;
    private javax.swing.JButton jbtNhap;
    private javax.swing.JButton jbtSua;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtThoat;
    private javax.swing.JButton jbtTim;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JComboBox<String> jcbMaLop;
    private javax.swing.JRadioButton jrbNam;
    private javax.swing.JRadioButton jrbNu;
    private javax.swing.JTextField jtfDiaChi;
    private javax.swing.JTextField jtfHoTen;
    private javax.swing.JTextField jtfMaSV;
    private javax.swing.JTextField jtfNgaySinh;
    private javax.swing.JTable tblSinhVien;
    // End of variables declaration//GEN-END:variables

}