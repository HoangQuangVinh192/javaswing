package Controller;

import Model.KetQuaHocTap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PV
 */
public class KetQuaController {

    public static ArrayList<KetQuaHocTap> getAll(String ma) {
        ArrayList<KetQuaHocTap> listKQHT = new ArrayList<>();
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select SinhVien.MaSinhVien, HoTen , SinhVien.MaLop, TenLop, KetQua.MaMon, TenMon,HocKy, SoTC, DiemTX1, DiemTX2, DiemGiuaKy, DiemThy,DiemTongKetDiem10, DiemTongKetDiem4, DiemChu, XepLoai, DiemTB, SoTietNghi, DieuKienDuThi \n"
                    + "from KetQua inner join MonHoc on MonHoc.MaMon=KetQua.MaMon\n"
                    + "	inner join SinhVien on KetQua.MaSinhVien=SinhVien.MaSinhVien\n"
                    + "	inner join Lop on SinhVien.MaLop=Lop.MaLop\n"
                    + "where KetQua.MaSinhVien = '"+ma+"'");
            while (rs.next()) {
                String maMon = rs.getString("MaMon");
                String tenMon = rs.getString("TenMon");
                String maSinhVien = rs.getString("MaSinhVien");
                String maLop = rs.getString("MaLop");
                String tenLop = rs.getString("TenLop");
                int soTC = rs.getInt("SoTC");
                Double diemThi = rs.getDouble("DiemThy");
                String hoTen = rs.getString("HoTen");
                Double diemTX1 = rs.getDouble("DiemTX1");
                Double diemTX2 = rs.getDouble("DiemTX2");
                Double diemGiuaKy = rs.getDouble("DiemGiuaKy");
                Double diemTrungBinh = rs.getDouble("DiemTB");
                int soTietNghi = rs.getInt("SoTietNghi");
                String dieuKienDuThi = rs.getString("DieuKienDuThi");
                Double diem10 = rs.getDouble("DiemTongKetDiem10");
                Double diem4 = rs.getDouble("DiemTongKetDiem4");
                String xepLoai = rs.getString("XepLoai");
                String diemChu = rs.getString("DiemChu");
                String hocKy = rs.getString("HocKy");

                KetQuaHocTap s = new KetQuaHocTap(maSinhVien, hoTen, maMon, tenMon, soTC, hocKy, maLop, tenLop, diemTX1, diemTX2, diemGiuaKy, diemThi, diemTrungBinh, diem10, diem4, diemChu, soTietNghi, dieuKienDuThi, xepLoai);
                listKQHT.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKQHT;
    }

    public static ArrayList<String> getMaMonHoc() {
        ArrayList<String> list = new ArrayList<>();
        Connection conn = DBConnect.getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select MaMon from MonHoc");
            while (rs.next()) {
                String ma = rs.getString("MaMon");
                list.add(ma);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static String getTenMonHoc(String m) {
        String tenMH = null;
        Connection conn = DBConnect.getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(" select tenMon from MonHoc where MaMon='" + m + "'");
            while (rs.next()) {
                tenMH = rs.getString("tenMon");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tenMH;
    }

    public static String getHocKy(String m) {
        String hocKy = null;
        Connection conn = DBConnect.getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(" select HocKy from KetQua where MaMon='" + m + "'");
            while (rs.next()) {
                hocKy = rs.getString("HocKy");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hocKy;
    }

    public static String getTenSinhVien(String m) {
        String tenMH = null;
        Connection conn = DBConnect.getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(" select HoTen from SinhVien where MaSinhVien='" + m + "'");
            while (rs.next()) {
                tenMH = rs.getString("HoTen");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tenMH;
    }

    public static ArrayList<KetQuaHocTap> getSVTheoMonHoc(String m) {
        ArrayList<KetQuaHocTap> listKQHT = new ArrayList<>();
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select SinhVien.MaSinhVien, HoTen , SinhVien.MaLop, TenLop, KetQua.MaMon, TenMon, SoTC,HocKy, DiemTX1, DiemTX2, DiemGiuaKy, DiemThy,DiemTongKetDiem10, DiemTongKetDiem4, DiemChu, XepLoai, DiemTB, SoTietNghi, DieuKienDuThi \n"
                    + "from KetQua inner join MonHoc on MonHoc.MaMon=KetQua.MaMon\n"
                    + "	inner join SinhVien on KetQua.MaSinhVien=SinhVien.MaSinhVien\n"
                    + "	inner join Lop on SinhVien.MaLop=Lop.MaLop\n"
                    + "where KetQua.MaMon='" + m + "'");
            while (rs.next()) {
                String maMon = rs.getString("MaMon");
                String tenMon = rs.getString("TenMon");
                String maSinhVien = rs.getString("MaSinhVien");
                String maLop = rs.getString("MaLop");
                String tenLop = rs.getString("TenLop");
                int soTC = rs.getInt("SoTC");
                Double diemThi = rs.getDouble("DiemThy");
                String hoTen = rs.getString("HoTen");
                Double diemTX1 = rs.getDouble("DiemTX1");
                Double diemTX2 = rs.getDouble("DiemTX2");
                Double diemGiuaKy = rs.getDouble("DiemGiuaKy");
                Double diemTrungBinh = rs.getDouble("DiemTB");
                int soTietNghi = rs.getInt("SoTietNghi");
                String dieuKienDuThi = rs.getString("DieuKienDuThi");
                Double diem10 = rs.getDouble("DiemTongKetDiem10");
                Double diem4 = rs.getDouble("DiemTongKetDiem4");
                String xepLoai = rs.getString("XepLoai");
                String diemChu = rs.getString("DiemChu");
                String hocKy = rs.getString("HocKy");

                KetQuaHocTap s = new KetQuaHocTap(maSinhVien, hoTen, maMon, tenMon, soTC, hocKy, maLop, tenLop, diemTX1, diemTX2, diemGiuaKy, diemThi, diemTrungBinh, diem10, diem4, diemChu, soTietNghi, dieuKienDuThi, xepLoai);
                listKQHT.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKQHT;
    }

    public static void setDiemTrenLop(KetQuaHocTap kq) {
        Connection conn = DBConnect.getConnection();
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("insert into KetQua values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, kq.getMaSV());
            st.setString(2, kq.getMaMon());
            st.setString(3, kq.getHocKy());
            st.setDouble(4, kq.getDiemTX1());
            st.setDouble(5, kq.getDdiemTX2());
            st.setDouble(6, kq.getDiemGiuaKy());
            st.setDouble(7, kq.getDiemTrungBinh());
            st.setInt(8, kq.getSoTietNghi());
            st.setString(9, kq.getDieuKienDuThi());
            st.setDouble(10, -1);
            st.setDouble(11, -1);
            st.setDouble(12, -1);
            st.setString(13, null);
            st.setString(14, null);
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateDiemTrenLop(KetQuaHocTap kq) {
        Connection conn = DBConnect.getConnection();
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("update KetQua set DiemTX1=?, DiemTX2=?, DiemGiuaKy=?,DiemTB=?, SoTietNghi=?, DieuKienDuthi=? where MaSinhVien=? and MaMon=? ");

            st.setDouble(1, kq.getDiemTX1());
            st.setDouble(2, kq.getDdiemTX2());
            st.setDouble(3, kq.getDiemGiuaKy());
            st.setDouble(4, kq.getDiemTrungBinh());
            st.setInt(5, kq.getSoTietNghi());
            st.setString(6, kq.getDieuKienDuThi());
            st.setString(7, kq.getMaSV());
            st.setString(8, kq.getMaMon());

            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertDiemThi(KetQuaHocTap kq) {
        Connection conn = DBConnect.getConnection();
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("update KetQua set DiemThy=?, DiemTongKetDiem10=?, DiemTongKetDiem4=?,DiemChu=?, XepLoai=? where MaSinhVien=? and MaMon=? ");

            st.setDouble(1, kq.getDiemThi());
            st.setDouble(2, kq.getDiemTK10());
            st.setDouble(3, kq.getDiemTK4());
            st.setString(4, kq.getDiemChu());
            st.setString(5, kq.getXepLoai());
            st.setString(6, kq.getMaSV());
            st.setString(7, kq.getMaMon());

            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static KetQuaHocTap getSV(String maSV, String maMH) {
        Connection conn = DBConnect.getConnection();
        KetQuaHocTap s = null;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select SinhVien.MaSinhVien, HoTen , SinhVien.MaLop, TenLop, KetQua.MaMon, TenMon,HocKy, SoTC, DiemTX1, DiemTX2, DiemGiuaKy, DiemThy,DiemTongKetDiem10, DiemTongKetDiem4, DiemChu, XepLoai, DiemTB, SoTietNghi, DieuKienDuThi \n"
                    + "from KetQua inner join MonHoc on MonHoc.MaMon=KetQua.MaMon\n"
                    + "	inner join SinhVien on KetQua.MaSinhVien=SinhVien.MaSinhVien\n"
                    + "	inner join Lop on SinhVien.MaLop=Lop.MaLop\n"
                    + "where KetQua.MaSinhVien = '" + maSV + "' and KetQua.MaMon='" + maMH + "'");
            while (rs.next()) {
                String maMon = rs.getString("MaMon");
                String tenMon = rs.getString("TenMon");
                String maSinhVien = rs.getString("MaSinhVien");
                String maLop = rs.getString("MaLop");
                String tenLop = rs.getString("TenLop");
                int soTC = rs.getInt("SoTC");
                Double diemThi = rs.getDouble("DiemThy");
                String hoTen = rs.getString("HoTen");
                Double diemTX1 = rs.getDouble("DiemTX1");
                Double diemTX2 = rs.getDouble("DiemTX2");
                Double diemGiuaKy = rs.getDouble("DiemGiuaKy");
                Double diemTrungBinh = rs.getDouble("DiemTB");
                int soTietNghi = rs.getInt("SoTietNghi");
                String dieuKienDuThi = rs.getString("DieuKienDuThi");
                Double diem10 = rs.getDouble("DiemTongKetDiem10");
                Double diem4 = rs.getDouble("DiemTongKetDiem4");
                String xepLoai = rs.getString("XepLoai");
                String diemChu = rs.getString("DiemChu");
                String hocKy = rs.getString("HocKy");
                s = new KetQuaHocTap(maSinhVien, hoTen, maMon, tenMon, soTC, hocKy, maLop, tenLop, diemTX1, diemTX2, diemGiuaKy, diemThi, diemTrungBinh, diem10, diem4, diemChu, soTietNghi, dieuKienDuThi, xepLoai);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    public static void delete(String maMH, String maSV){
        Connection conn = DBConnect.getConnection();
        PreparedStatement st = null;
        try {
            st= conn.prepareStatement("delete KetQua where MaSinhVien="+maSV+" and MaMon="+maMH+"");
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KetQuaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
