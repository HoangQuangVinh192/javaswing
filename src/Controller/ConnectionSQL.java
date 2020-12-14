/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SinhVien;
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
 * @author DELL
 */
public class ConnectionSQL {
    Connection conn=null;
    public ConnectionSQL(){
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=QuanLyDiem;"  ;
        
        String username = "sa";
        String password="123";
        conn = DriverManager.getConnection(connectionUrl,username,password);
          
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public  void themSV(SinhVien sv) {

        //Connection connection = null;
        PreparedStatement sttm = null;
        try {
            //connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "Insert into SinhVien(MaSinhVien,HoTen,NgaySinh,GioiTinh,DiaChi,MaLop) values(?,?,?,?,?,?)";
            sttm = conn.prepareCall(sql);
            sttm.setString(1, sv.getMaSV());
            sttm.setString(2, sv.getHoTen());
            sttm.setString(3, sv.getNgaySinh());
            sttm.setString(5, sv.getGioiTinh());
            sttm.setString(4, sv.getDiaChi());
            sttm.setString(6, sv.getMaLop());

            sttm.execute();
        } catch (SQLException ex) {
            //Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Trùng mã sinh viên!!!");
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
    }
    
    public boolean update(SinhVien sv) throws SQLException {
       
        //Connection connection = null;
        PreparedStatement sttm = null;
        try {
            //connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123456");

            //truy van
            String sql = "update SinhVien set HoTen=?,NgaySinh=?,GioiTinh=?,DiaChi=?, MaLop=? where MaSinhVien = ?";
            sttm =conn.prepareCall(sql);

            sttm.setString(1, sv.getHoTen());
            sttm.setString(2, sv.getNgaySinh());
            sttm.setString(4, sv.getGioiTinh());
            sttm.setString(3, sv.getDiaChi());
            sttm.setString(5, sv.getMaLop());
            sttm.setString(6, sv.getMaSV());

            sttm.executeUpdate();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Lỗi Cập Nhật!");
            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
           
        } 
         return sttm.executeUpdate()>0;
}
    
    public void deleteStudent(String maSinhVien) {
        
        /*String sql="DELETE FROM SinhVien WHERE MaSinhVien='"+ma+"'";
        PreparedStatement ps=conn.prepareCall(sql);
        ps.setString(1, ma);
        ps.execute(sql);
        conn.close();*/
      
        Connection connection = null;
        PreparedStatement sttm = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "delete from SINHVIEN where MaSinhVien=?";
            sttm = connection.prepareCall(sql);

            sttm.setString(1, maSinhVien);
            

            sttm.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi");
        } 
        }//ket thuc
        
    
    
    public ArrayList<SinhVien> getListStudent(){
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        String sql = "SELECT * FROM SinhVien";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SinhVien s = new SinhVien();
                s.setMaSV(rs.getString("MaSinhVien"));
                s.setHoTen(rs.getString("HoTen"));
                s.setNgaySinh(rs.getString("NgaySinh"));
                s.setGioiTinh(rs.getString("GioiTinh"));
                s.setDiaChi(rs.getString("DiaChi"));
                s.setMaLop(rs.getString("MaLop"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public  List<SinhVien> findByMa(String maSV) {

        List<SinhVien> list = new ArrayList<>();
        //Connection connection = null;
        PreparedStatement sttm = null;
        try {
            //connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyDiem;", "sa", "123");

            //truy van
            String sql = "Select *from SinhVien where MaSinhVien like ?";
            sttm = conn.prepareCall(sql);
            sttm.setString(1, "%" + maSV + "%");

            ResultSet resultSet = sttm.executeQuery();
            while (resultSet.next()) {
                SinhVien sv;
                sv = new SinhVien(resultSet.getString("MaSinhVien"), resultSet.getString("HoTen"), 
                        resultSet.getString("NgaySinh"), resultSet.getString("GioiTinh"),
                        resultSet.getString("DiaChi"), resultSet.getString("MaLop"));
                list.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }//ket thuc
        return list;
    }
    
    

}
