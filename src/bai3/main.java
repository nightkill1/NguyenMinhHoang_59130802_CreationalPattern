/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author hoang
 */
public class main {
    public static void main(String[] args) {
        ShapeFactory s1 = new ShapeFactory();
        Shape cir = s1.createShape(ShapeType.Circle);
        Shape tri = s1.createShape(ShapeType.Triangle);
        Shape rec = s1.createShape(ShapeType.Rectangle);
        
        System.out.println(cir.draw());
        System.out.println(rec.draw());
        System.out.println(tri.draw());
        
       
        
    }
}
