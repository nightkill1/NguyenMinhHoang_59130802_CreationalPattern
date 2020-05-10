/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author hoang
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mystring MS = new Mystring("Nguyễn")
                        .addString(" Minh ")
                        .addString("Hoàng \n")
                        .addString("điểm: ")
                        .addFloat(9.5f)
                        .addString("\nqua môn: ")
                        .addBool(true)
                        .build();
    
        System.out.print(MS.toString());
        
    }
    
            
}
