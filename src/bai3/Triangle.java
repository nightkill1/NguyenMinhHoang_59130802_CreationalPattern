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
public class Triangle extends Shape{

   
   private static Shape Tri;

    protected Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    public static Shape newTriangle()
    {
        if(Tri == null)
        {
            Tri = new Triangle("circle brush\t", "cricle paper\t", "circle fram\t");
            
        }
        return Tri;
    }
    @Override
    public String draw() {
        return "Triangle:  " +  getBrush()+"\t" + getFrame() +"\t" + getPaper();
    }
    
}
