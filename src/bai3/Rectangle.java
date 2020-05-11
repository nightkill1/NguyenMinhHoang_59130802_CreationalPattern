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
public class Rectangle extends Shape{
     private static Shape rec;

    protected Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    public static Shape newRectangle()
    {
        if(rec == null)
        {
            rec = new Rectangle("circle brush\t", "cricle paper\t", "circle fram\t");
            
        }
        return rec;
    }
    @Override
    public String draw() {
        return "Rectangle:  " +  getBrush()+ getFrame() + getPaper();
    }
    
    
}
