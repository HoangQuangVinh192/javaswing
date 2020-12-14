/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Khoa;
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
public class KhoaDAO {

    public static List<Khoa> findAll() {
        //lay tat ca danh sách khoa
        List<Khoa> khoaList = new ArrayList<>();
        Connection connection = null;
        Statement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "Select *from KHOA";
            sttm = connection.createStatement();

            ResultSet resultSet = sttm.executeQuery(sql);
            while (resultSet.next()) {
                Khoa kh;
                kh = new Khoa(resultSet.getString("MaKhoa"), resultSet.getString("TenKhoa"), resultSet.getString("TruongKhoa"), resultSet.getString("DiaChiKhoa"),
                        resultSet.getString("SDT"), resultSet.getString("EmailKhoa"));
                khoaList.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
        return khoaList;
    }

    public static void insert(Khoa khoa) {

        Connection connection = null;
        PreparedStatement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "Insert into khoa(MaKhoa,TenKhoa,TruongKhoa,DiaChiKhoa,SDT,EmailKhoa) values(?,?,?,?,?,?)";
            sttm = connection.prepareCall(sql);
            sttm.setString(1, khoa.getMaKhoa());
            sttm.setString(2, khoa.getTenKhoa());
            sttm.setString(3, khoa.getTruongKhoa());
            sttm.setString(5, khoa.getSoDienThoai());
            sttm.setString(4, khoa.getDiaChi());
            sttm.setString(6, khoa.getEmailKhoa());

            sttm.execute();
        } catch (SQLException ex) {
            //Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Lỗi Trùng mã hoặc liên kết Khóa Ngoại!");
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
    }

    public static boolean update(Khoa khoa) throws SQLException {

        Connection connection = null;
        PreparedStatement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "update khoa set TenKhoa=?,TruongKhoa=?,DiaChiKhoa=?,SDT=?,EmailKhoa=? where MaKhoa = ?";
            sttm = connection.prepareCall(sql);

            sttm.setString(1, khoa.getTenKhoa());
            sttm.setString(2, khoa.getTruongKhoa());
            sttm.setString(4, khoa.getSoDienThoai());
            sttm.setString(3, khoa.getDiaChi());
            sttm.setString(5, khoa.getEmailKhoa());
            sttm.setString(6, khoa.getMaKhoa());

            sttm.executeUpdate();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Lỗi Cập Nhật!");
            Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return sttm.executeUpdate() > 0;
    }//ket thuc 

    public static void delete(String maKhoa) {

        Connection connection = null;
        PreparedStatement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "delete from khoa where MaKhoa=?";
            sttm = connection.prepareCall(sql);

            sttm.setString(1, maKhoa);

            sttm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
    }

    private static PreparedStatement PreparedStatement(String sql) {
        return null;
    }

    public static List<Khoa> findByTen(String tenKhoa) {

        List<Khoa> khoaList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "Select *from KHOA where TenKhoa like ?";
            sttm = connection.prepareCall(sql);
            sttm.setString(1, "%" + tenKhoa + "%");

            ResultSet resultSet = sttm.executeQuery();
            while (resultSet.next()) {
                Khoa khoa;
                khoa = new Khoa(resultSet.getString("MaKhoa"), resultSet.getString("TenKhoa"), resultSet.getString("TruongKhoa"), resultSet.getString("DiaChiKhoa"),
                        resultSet.getString("SDT"), resultSet.getString("MaKhoa"));
                khoaList.add(khoa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
        return khoaList;
    }
}
