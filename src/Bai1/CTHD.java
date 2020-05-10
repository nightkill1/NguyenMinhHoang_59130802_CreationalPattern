/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author hoang
 */
public class CTHD {

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getChiecKhau() {
        return chiecKhau;
    }

    public void setChiecKhau(int chiecKhau) {
        this.chiecKhau = chiecKhau;
    }
    String sanPham;
    int soLuong;
    float donGia;
    int chiecKhau;
    
    public CTHD(String sanPham,  int soLuong, float donGia,   int chiecKhau)
    {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chiecKhau = chiecKhau;
    }

    @Override
    public String toString() {
        return "{" + " sản phẩm= " + sanPham + ", Số lượng= "  + soLuong + ", Đơn giá=" + donGia + ", Chiếc khấu=" + chiecKhau +"% }";
    }
}
