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
public class Mystring{
    String str;

   
    Mystring(String str)
    {
        this.str = str;
        
    }

    public Mystring addString(String s)
    {
         str += s;
        return this;
    }
     public Mystring addFloat(float f)
    {
         str += f;
        return this;
    }
    public Mystring addBool(boolean b)
    {
        str += b;
        return this;
    }
     @Override
    public String toString() {
        return str ;
    }

    Mystring build() {
        return this;
    }
}
