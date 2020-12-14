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
public class Khoa {
    private String maKhoa,tenKhoa,truongKhoa,diaChi,soDienThoai,emailKhoa;

    public Khoa() {
    }

    public Khoa(String maKhoa, String tenKhoa, String truongKhoa, String diaChi, String soDienThoai, String emailKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.truongKhoa = truongKhoa;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.emailKhoa = emailKhoa;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getTruongKhoa() {
        return truongKhoa;
    }

    public void setTruongKhoa(String truongKhoa) {
        this.truongKhoa = truongKhoa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmailKhoa() {
        return emailKhoa;
    }

    public void setEmailKhoa(String emailKhoa) {
        this.emailKhoa = emailKhoa;
    }
    
    
}
