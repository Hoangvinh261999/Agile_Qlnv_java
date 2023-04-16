/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author kuteb
 */
public class NhanVienVanPhong implements Serializable {
    private String MaNV;
    private String HoTen;
    private int Tuoi;
    private String Email;
    private int Luong;
    private String diachi;
    private String phongBan;
    private String gioiTinh;
    private String soDT;
    private String role;
private Integer MaTK;



    public NhanVienVanPhong() {
    }

    public NhanVienVanPhong(String MaNV, String HoTen, int Tuoi, String Email, int Luong, String diachi, String phongBan, String gioiTinh, String soDT, String role, Integer MaTK) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.Email = Email;
        this.Luong = Luong;
        this.diachi = diachi;
        this.phongBan = phongBan;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.role = role;
        this.MaTK = MaTK;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role ="nv";
    }

    public Integer getMaTK() {
        return MaTK;
    }

    public void setMaTK(Integer MaTK) {
        this.MaTK = MaTK;
    }

    
}
