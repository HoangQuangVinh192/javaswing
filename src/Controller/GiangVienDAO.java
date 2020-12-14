/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.GiangVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TungC2U
 */
public class GiangVienDAO {

    public static List<GiangVien> findAll() {
        //lay tat ca danh sách giảng viên
        List<GiangVien> giangvienList = new ArrayList<>();
        Connection connection = null;
        Statement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "Select *from GIANGVIEN";
            sttm = connection.createStatement();

            ResultSet resultSet = sttm.executeQuery(sql);
            while (resultSet.next()) {
                GiangVien gv;
                gv = new GiangVien(resultSet.getString("MaGiangVien"), resultSet.getString("TenGiangVien"), resultSet.getString("GioiTinh"), resultSet.getString("SoDT"),
                         resultSet.getString("Email"), resultSet.getString("MaKhoa"));
                giangvienList.add(gv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
        return giangvienList;
    }

    public static void insert(GiangVien gv) {
        List<GiangVien> giangvienList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "Insert into giangvien(MaGiangVien,TenGiangVien,GioiTinh,SoDT,Email,MaKhoa) values(?,?,?,?,?,?)";
            sttm = connection.prepareCall(sql);
            sttm.setString(1, gv.getMaGV());
            sttm.setString(2, gv.getTenGV());
            sttm.setString(3, gv.getGioiTinh());
            sttm.setString(4, gv.getSoDT());
            sttm.setString(5, gv.getEmail());
            sttm.setString(6, gv.getMaKhoa());

            sttm.execute();
        } catch (SQLException ex) {
            //Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Lỗi Trùng mã hoặc liên kết Khóa Ngoại!");
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
    }

    public static boolean update(GiangVien gv) throws SQLException {
        
        Connection connection = null;
        PreparedStatement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "update giangvien set TenGiangVien=?,GioiTinh=?,SoDT=?,Email=?,MaKhoa=? where MaGiangVien = ?";
            sttm = connection.prepareCall(sql);

            sttm.setString(1, gv.getTenGV());
            sttm.setString(2, gv.getGioiTinh());
            sttm.setString(3, gv.getSoDT());
            sttm.setString(4, gv.getEmail());
            sttm.setString(5, gv.getMaKhoa());
            sttm.setString(6, gv.getMaGV());

            sttm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
       return sttm.executeUpdate()>0;
    }

    public static void delete(String maGV) {
        List<GiangVien> giangvienList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "delete from giangvien where MaGiangVien=?";
            sttm = connection.prepareCall(sql);

            sttm.setString(1, maGV);
            

            sttm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
    }
    
    private static PreparedStatement PreparedStatement(String sql) {
        return null;
    }
    
    public static List<GiangVien> findByTen(String tenGV) {
        //lay tat ca danh sách giảng viên
        List<GiangVien> giangvienList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "Select *from GIANGVIEN where TenGiangVien like ?";
            sttm = connection.prepareCall(sql);
            sttm.setString(1, "%"+tenGV+"%");

            ResultSet resultSet = sttm.executeQuery();
            while (resultSet.next()) {
                GiangVien gv;
                gv = new GiangVien(resultSet.getString("MaGiangVien"), resultSet.getString("TenGiangVien"), resultSet.getString("GioiTinh"), resultSet.getString("SoDT"),
                         resultSet.getString("Email"), resultSet.getString("MaKhoa"));
                giangvienList.add(gv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
        return giangvienList;
    }

}
