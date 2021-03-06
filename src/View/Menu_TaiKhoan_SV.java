/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import javax.swing.JOptionPane;

/**
 *
 * @author Lê Dũng
 */
public class Menu_TaiKhoan_SV extends javax.swing.JFrame {

    /**
     * Creates new form TaiKhoan_SV
     */
    public Menu_TaiKhoan_SV() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiDangXuat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        lmiKetQuaHocTap = new javax.swing.JMenuItem();
        jmiKetQuaThi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-ngang.png"))); // NOI18N

        jMenu1.setText("Hệ thống");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 10, 0, 10));

        jmiDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmiDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Log out.png"))); // NOI18N
        jmiDangXuat.setText("Đăng xuất");
        jmiDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(jmiDangXuat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Hiển thị");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lmiKetQuaHocTap.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lmiKetQuaHocTap.setText("Kết quả học tập");
        lmiKetQuaHocTap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmiKetQuaHocTapActionPerformed(evt);
            }
        });
        jMenu2.add(lmiKetQuaHocTap);

        jmiKetQuaThi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmiKetQuaThi.setText("Kết quả thi");
        jmiKetQuaThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiKetQuaThiActionPerformed(evt);
            }
        });
        jMenu2.add(jmiKetQuaThi);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDangXuatActionPerformed
        int cont = JOptionPane.showConfirmDialog(null, "Bạn muốn đăng xuất?","Đăng xuất",JOptionPane.YES_NO_OPTION);
        if(cont==JOptionPane.YES_OPTION){
            new DangNhap().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jmiDangXuatActionPerformed

    private void lmiKetQuaHocTapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmiKetQuaHocTapActionPerformed
        new KetQuaHocTapSV().setVisible(true);
        dispose();
    }//GEN-LAST:event_lmiKetQuaHocTapActionPerformed

    private void jmiKetQuaThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiKetQuaThiActionPerformed
        new KetQuaThiForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_jmiKetQuaThiActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_TaiKhoan_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_TaiKhoan_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_TaiKhoan_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_TaiKhoan_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_TaiKhoan_SV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiDangXuat;
    private javax.swing.JMenuItem jmiKetQuaThi;
    private javax.swing.JMenuItem lmiKetQuaHocTap;
    // End of variables declaration//GEN-END:variables
}
