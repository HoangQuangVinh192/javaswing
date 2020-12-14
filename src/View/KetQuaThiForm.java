/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.KetQuaController;
import Model.KetQuaHocTap;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PV
 */
public class KetQuaThiForm extends javax.swing.JFrame {

    /**
     * Creates new form KetQuaThiForm
     */
    public KetQuaThiForm() {
        initComponents();
        setLocationRelativeTo(null);
        hienThi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlbHoTen = new javax.swing.JLabel();
        jlbMaSinhVien = new javax.swing.JLabel();
        jlbLop = new javax.swing.JLabel();
        jbtThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jlbHoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbHoTen.setText("jLabel1");

        jlbMaSinhVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbMaSinhVien.setText("jLabel2");

        jlbLop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbLop.setText("jLabel3");

        jbtThoat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit.png"))); // NOI18N
        jbtThoat.setText("Thoát");
        jbtThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThoatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Kết quả thi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtThoat)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbLop)
                            .addComponent(jlbMaSinhVien)
                            .addComponent(jlbHoTen)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel1)))
                .addContainerGap(486, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jlbHoTen)
                .addGap(27, 27, 27)
                .addComponent(jlbMaSinhVien)
                .addGap(18, 18, 18)
                .addComponent(jlbLop)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtThoat)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThoatActionPerformed
        new Menu_TaiKhoan_SV().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public void hienThi() {
        ArrayList<KetQuaHocTap> list = KetQuaController.getAll(DangNhap.maSV);
        jlbHoTen.setText("Họ tên:" + list.get(0).getTenSV());
        jlbMaSinhVien.setText("Mã sinh viên:" + list.get(0).getMaSV());
        jlbLop.setText("Lớp:" + list.get(0).getTenLop());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("STT");
        model.addColumn("Tên môn học");
        model.addColumn("Số TC");
        model.addColumn("Điểm TB trên lớp");
        model.addColumn("Điểm Thi");
        model.addColumn("Điểm tổng kết 10");
        model.addColumn("Điểm tổng kết 4");
        model.addColumn("Điểm chữ");
        model.addColumn("Xếp loại");

        for (int i = 0; i < list.size(); i++) {
            String dthi, d10, d4;
            if(list.get(i).getDiemThi()<0){
                dthi="";
            }
            else
                dthi=(String)(list.get(i).getDiemThi().toString());
            if(list.get(i).getDiemThi()<0){
                d10="";
            }
            else
                d10=(String)(list.get(i).getDiemThi().toString());
            if(list.get(i).getDiemTK10()<0){
                d10="";
            }
            else
                dthi=(String)(list.get(i).getDiemTK10().toString());
            if(list.get(i).getDiemTK4()<0){
                d4="";
            }
            else
                d4=(String)(list.get(i).getDiemTK4().toString());
            
            model.addRow(new Object[]{
                (i + 1), list.get(i).getTenMon(), list.get(i).getSoTC(), list.get(i).getDiemTrungBinh(),
                dthi, d10, d4,
                list.get(i).getDiemChu(), list.get(i).getXepLoai()
            });
        }
        jTable1.setModel(model);
    }
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
            java.util.logging.Logger.getLogger(KetQuaThiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KetQuaThiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KetQuaThiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KetQuaThiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KetQuaThiForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtThoat;
    private javax.swing.JLabel jlbHoTen;
    private javax.swing.JLabel jlbLop;
    private javax.swing.JLabel jlbMaSinhVien;
    // End of variables declaration//GEN-END:variables
}
