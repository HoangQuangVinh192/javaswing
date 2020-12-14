/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
public class Hienthimonhoccontroller {

    public static ArrayList<monhoc> getAll(String item) {
        ArrayList<monhoc> listmh = new ArrayList<>();
        Connection conn = DBConnect.getConnection();
        try {
            Statement st = conn.createStatement();
            String sql = "select * from monhoc inner join ketqua on monhoc.mamon=ketqua.mamon inner join sinhvien on sinhvien.masinhvien = ketqua.masinhvien where sinhvien.masinhvien=?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, item);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                String mamon = rs.getString("mamon");
                String tenmon = rs.getString("tenmon");
                int sotc = rs.getInt("sotc");
                String makhoa = rs.getString("makhoa");
                String masv = rs.getString("masinhvien");
                String tensv = rs.getString("hoten");

                monhoc mh = new monhoc(mamon, tenmon, sotc, makhoa, masv, tensv);
                listmh.add(mh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(lopcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listmh;
    }

}
