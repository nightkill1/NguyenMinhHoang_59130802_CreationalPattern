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
public class Circle extends Shape{
    private static Shape circle;

    protected Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    public static Shape newCircle()
    {
        if(circle == null)
        {
            circle = new Circle("circle brush\t", "cricle paper\t", "circle fram\t");
            
        }
        return circle;
    }
    @Override
    public String draw() {
        return "Cricle:  " +  getBrush()+"\t" + getFrame() +"\t" + getPaper();
    }
    
}
