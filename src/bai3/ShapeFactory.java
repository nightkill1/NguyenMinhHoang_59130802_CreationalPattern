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
public class ShapeFactory{
    public Shape createShape(ShapeType shapetype)
    {
        if(shapetype != null)
        {
            switch(shapetype)
            {
                case Rectangle:
                    return Rectangle.newRectangle();
                case Circle:
                    return Circle.newCircle();
                case Triangle:
                    return Triangle.newTriangle();
                default:break;
            }
        }
        return null;
    }
}
