/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author TungC2U
 */
public class GiangVien {
    public String maGV;
    public String tenGV;
     public String gioiTinh;
     public String soDT,email,maKhoa;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, String gioiTinh, String soDT, String email, String maKhoa) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.email = email;
        this.maKhoa = maKhoa;
    }

    

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    
    
}
