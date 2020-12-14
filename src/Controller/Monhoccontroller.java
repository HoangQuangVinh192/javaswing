/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Khoa;
import Model.monhoc;
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
public class Monhoccontroller {
           public static ArrayList<monhoc> getAll() {
        ArrayList<monhoc> listmh = new ArrayList<>();
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from monhoc");
            while (rs.next()) {
                String mamon = rs.getString("mamon");
                String tenmon = rs.getString("tenmon");
                int sotc = rs.getInt("sotc");
                String makhoa = rs.getString("makhoa");
                
                monhoc mh= new monhoc(mamon, tenmon, sotc, makhoa);
                listmh.add(mh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listmh;
        }
        public boolean exe(PreparedStatement pre) throws SQLException {
        if (pre != null) {
            int result = pre.executeUpdate();
            return true;
        }
        return false;
        }
        
        public boolean  Add(monhoc item) {
        
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql= "insert into monhoc values (?,?,?,?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, item.getMaMon());
            pre.setString(2, item.getTenMon());
            pre.setInt(3, item.getSoTC());
            pre.setString(4, item.getMaKhoa());
            return exe(pre);
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
        }
        public boolean  update(monhoc item) {
        
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql= "update monhoc set tenmon=?,sotc=?,makhoa=? where mamon=?";
            PreparedStatement pre = conn.prepareStatement(sql);
           
            pre.setString(4, item.getMaMon());
            pre.setString(1, item.getTenMon());
            pre.setInt(2, item.getSoTC());
            pre.setString(3, item.getMaKhoa());
            return exe(pre);
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
        }
        public boolean  delete(monhoc item) {
        
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql= "delete from monhoc where mamon=?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, item.getMaMon());
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
