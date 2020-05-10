/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author hoang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
         HoaDon hoaDon = new HoaDon.HoaDonBuilder()
                            .setHeader(new HoaDonHeader("HD001", formatDate.parse("06/08/1999"), "Nguyễn Minh Hoàng"))
                            .addDsCTDH(new CTHD("Laptop MIS GL7600", 1, 150000, 15))
                            .addDsCTDH(new CTHD("Tai nghe Logitech P20", 2, 50000, 10))
                            .addDsCTDH(new CTHD("Chuộc không dây Asus", 1, 6000, 10))
                            .addDsCTDH(new CTHD("Bàn Phím cơ", 1, 25000, 15))
                            .build();
         HoaDon hoaDon2 = new HoaDon.HoaDonBuilder()
                            .setHeader(new HoaDonHeader("HD002", formatDate.parse("13/12/1998"), "Nguyễn Đức Huy"))
                            .addDsCTDH(new CTHD("Laptop Asus ROG", 1, 2000000, 10))
                            .addDsCTDH(new CTHD("Tai nghe Wangming ", 2, 15000, 12))
                            .addDsCTDH(new CTHD("Chuộc Logitech G5", 2, 10000, 12))
                            .build();
         System.out.println(hoaDon.toString());
         System.out.println("--------------------------------------------------");
         System.out.print(hoaDon2.toString());
    }
    
}
