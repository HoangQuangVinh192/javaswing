/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TaiKhoan;
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
public class taikhoancontroller {
     public static ArrayList<TaiKhoan> getAll() {
        ArrayList<TaiKhoan> listlh = new ArrayList<>();
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Taikhoan");
            while (rs.next()) {
                String tentaikhoan = rs.getString("tentaikhoan");
                String matkhau = rs.getString("matkhau");
                String quyentruycap = rs.getString("quyentruycap");
                String masinhvien = rs.getString("masinhvien");
                TaiKhoan s = new TaiKhoan(tentaikhoan, matkhau, quyentruycap,masinhvien);
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

    public boolean Add(TaiKhoan item) {

        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "insert into TaiKhoan values (?,?,?,?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, item.getTenTaiKhoan());
            pre.setString(2, item.getMatKhau());
            pre.setString(3, item.getQuyenTruyCap());
            pre.setString(4, item.getMasinhvien());
            return exe(pre);
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public boolean update(TaiKhoan item) {

        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "update taikhoan set matkhau=?, masinhvien=? where tentaikhoan=?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, item.getMatKhau());
            pre.setString(2, item.getMasinhvien());
            pre.setString(3, item.getTenTaiKhoan());
            return exe(pre);
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean delete(TaiKhoan item) {
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "delete from taikhoan where tentaikhoan=?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, item.getTenTaiKhoan());
            return exe(pre);
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }
}
