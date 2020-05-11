/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author hoang
 */
public class HoaDonHeader {
    private String maHD;
    private Date ngayBan;

    private String tenKH;

    HoaDonHeader(String maHD, Date ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

   
    
   
    @Override
    public String toString() {
        return "hóa đơn:  " + "Mã hóa đơn=" + maHD + ", ngày bán=" + new SimpleDateFormat("dd/MM/yyy").format(ngayBan) + ", tên khách hàng=" + tenKH ;
    }
    
}
