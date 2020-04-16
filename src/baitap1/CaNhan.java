/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Pc
 */
public abstract class CaNhan{
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }   
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String hienThiTT() {
        return "Họ tên: "+hoTen+"\n" + "Tuổi: "+tuoi+"\n" + "Địa chỉ: "+diaChi+"\n" + "Sđt: "+sdt;
    }
}
