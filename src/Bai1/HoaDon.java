/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class HoaDon {

    HoaDonHeader HDheader;
    ArrayList<CTHD> dsCTHD;

    @Override
    public String toString() {
        String str = HDheader.toString();
        for (CTHD xuat : dsCTHD) {
            str += "\n" + xuat.toString();
        }
        return str;
        
    }
    
    protected HoaDon(HoaDonBuilder hdhd)
    {
        this.HDheader = hdhd.HDheader;
        this.dsCTHD = hdhd.dsCTHD;
    }
    
    public static class HoaDonBuilder
    {
        HoaDonHeader HDheader;
        ArrayList<CTHD> dsCTHD;
        
        public HoaDonBuilder() {
            this.dsCTHD = new ArrayList<>();
        }
        
        
        public HoaDonBuilder setHeader(HoaDonHeader HDheader) {
            this.HDheader = HDheader;
            return this;
        }

        
        public HoaDonBuilder addDsCTDH(CTHD cthd) {
            this.dsCTHD.add(cthd);
            return this;
        }
        
       
        public HoaDon build() {
            return new HoaDon(this);
        } 
    }
}
