package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PV
 */
public class KetQuaHocTap {
    protected String maSV;
    protected String tenSV;
    private String maMon;
    private String tenMon;
    private int soTC;
    private String hocKy;
    private String maLop;
    private String tenLop;
    private Double diemTX1;
    private Double DdiemTX2;
    private Double diemGiuaKy;
    private Double diemThi;
    private Double diemTrungBinh;
    private Double diemTK10;
    private Double diemTK4;
    private String diemChu;
    private int SoTietNghi;
    private String DieuKienDuThi;
    private String xepLoai;

    public KetQuaHocTap() {
    }

    public KetQuaHocTap(String maSV, String tenSV, String maMon, String tenMon, int soTC, String hocKy, String maLop, String tenLop, Double diemTX1, Double DdiemTX2, Double diemGiuaKy, Double diemThi, Double diemTrungBinh, Double diemTK10, Double diemTK4, String diemChu, int SoTietNghi, String DieuKienDuThi, String xepLoai) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTC = soTC;
        this.hocKy = hocKy;
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.diemTX1 = diemTX1;
        this.DdiemTX2 = DdiemTX2;
        this.diemGiuaKy = diemGiuaKy;
        this.diemThi = diemThi;
        this.diemTrungBinh = diemTrungBinh;
        this.diemTK10 = diemTK10;
        this.diemTK4 = diemTK4;
        this.diemChu = diemChu;
        this.SoTietNghi = SoTietNghi;
        this.DieuKienDuThi = DieuKienDuThi;
        this.xepLoai = xepLoai;
    }
public KetQuaHocTap(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
    }
    
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
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

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Double getDiemTX1() {
        return diemTX1;
    }

    public void setDiemTX1(Double diemTX1) {
        this.diemTX1 = diemTX1;
    }

    public Double getDdiemTX2() {
        return DdiemTX2;
    }

    public void setDdiemTX2(Double DdiemTX2) {
        this.DdiemTX2 = DdiemTX2;
    }

    public Double getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(Double diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
    }

    public Double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(Double diemThi) {
        this.diemThi = diemThi;
    }

    public Double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Double getDiemTK10() {
        return diemTK10;
    }

    public void setDiemTK10(Double diemTK10) {
        this.diemTK10 = diemTK10;
    }

    public Double getDiemTK4() {
        return diemTK4;
    }

    public void setDiemTK4(Double diemTK4) {
        this.diemTK4 = diemTK4;
    }

    public String getDiemChu() {
        return diemChu;
    }

    public void setDiemChu(String diemChu) {
        this.diemChu = diemChu;
    }

    public int getSoTietNghi() {
        return SoTietNghi;
    }

    public void setSoTietNghi(int SoTietNghi) {
        this.SoTietNghi = SoTietNghi;
    }

    public String getDieuKienDuThi() {
        return DieuKienDuThi;
    }

    public void setDieuKienDuThi(String DieuKienDuThi) {
        this.DieuKienDuThi = DieuKienDuThi;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    

    
}
