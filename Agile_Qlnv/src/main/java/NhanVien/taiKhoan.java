/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author kuteb
 */
public class taiKhoan {
    public String tenDN;
    public String pass;
    public String role;
  public String Matk;


    public taiKhoan() {
    }

    public taiKhoan(String tenDN, String pass, String role, String Matk) {
        this.tenDN = tenDN;
        this.pass = pass;
        this.role = role;
        this.Matk = Matk;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMatk() {
        return Matk;
    }

    public void setMatk(String Matk) {
        this.Matk = Matk;
    }


    
}
