/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lê Dũng
 */
public class TaiKhoan {
    private String TenTaiKhoan;
    private String MatKhau;
    private String QuyenTruyCap;
    private String Masinhvien;
    
    public TaiKhoan() {
    }

    public TaiKhoan(String TenTaiKhoan, String MatKhau, String QuyenTruyCap, String Masinhvien) {
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
        this.QuyenTruyCap = QuyenTruyCap;
        this.Masinhvien = Masinhvien;
    }

    public String getMasinhvien() {
        return Masinhvien;
    }

    public void setMasinhvien(String Masinhvien) {
        this.Masinhvien = Masinhvien;
    }

    

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getQuyenTruyCap() {
        return QuyenTruyCap;
    }

    public void setQuyenTruyCap(String QuyenTruyCap) {
        this.QuyenTruyCap = QuyenTruyCap;
    }
    
    
}
