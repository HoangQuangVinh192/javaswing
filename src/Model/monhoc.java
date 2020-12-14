/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tuan Bao
 */
public class monhoc extends KetQuaHocTap
{
    private String maMon;
    private String tenMon;
    private int soTC;
    private String maKhoa;
    

    public monhoc(String maMon, String tenMon, int soTC, String maKhoa, String maSV, String tenSV) {
        super(maSV, tenSV);
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTC = soTC;
        this.maKhoa = maKhoa;
    }

    public monhoc() {
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public monhoc(String maMon, String tenMon, int soTC, String maKhoa) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTC = soTC;
        this.maKhoa = maKhoa;
    }
}
