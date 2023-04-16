/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author kuteb
 */
public class QuanLy {
    private String hoTenQL;
    private String maQL;
    private String role;

    public QuanLy() {
    }

    public QuanLy(String hoTenQL, String maQL, String role) {
        this.hoTenQL = hoTenQL;
        this.maQL = maQL;
        this.role = role;
    }

    public String getHoTenQL() {
        return hoTenQL;
    }

    public void setHoTenQL(String hoTenQL) {
        this.hoTenQL = hoTenQL;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
