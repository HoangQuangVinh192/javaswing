/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Khoa;
import Model.lophoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuan Bao
 */
public class lopcontroller {

    public static ArrayList<lophoc> getAll() {
        ArrayList<lophoc> listlh = new ArrayList<>();
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from lop");
            while (rs.next()) {
                String maLop = rs.getString("maLop");
                String tenLop = rs.getString("tenLop");
                String maKhoa = rs.getString("maKhoa");
                lophoc s = new lophoc(maLop, tenLop, maKhoa);
                listlh.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listlh;
    }

    public boolean exe(PreparedStatement pre) throws SQLException {
        if (pre != null) {
            int result = pre.executeUpdate();
            return true;
        }
        return false;
    }

    public boolean Add(lophoc item) {

        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "insert into lop values (?,?,?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, item.getMaLop());
            pre.setString(2, item.getTenLop());
            pre.setString(3, item.getMaKhoa());
            return exe(pre);
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public boolean update(lophoc item) {

        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "update lop set tenlop=?,makhoa=? where malop=?";
            PreparedStatement pre = conn.prepareStatement(sql);

            pre.setString(1, item.getTenLop());
            pre.setString(2, item.getMaKhoa());
            pre.setString(3, item.getMaLop());
            return exe(pre);
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public boolean delete(lophoc item) {

        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "delete from lop where malop=?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, item.getMaLop());
            return exe(pre);
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public static ArrayList<Khoa> getkhoa() {
        ArrayList<Khoa> listkhoa = new ArrayList<>();
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select makhoa from khoa");
            while (rs.next()) {
                String makhoa = rs.getString("makhoa");
                Khoa k = new Khoa(makhoa, makhoa, makhoa, makhoa, makhoa, makhoa);
                listkhoa.add(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listkhoa;
    }
}
