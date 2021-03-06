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
public abstract class Shape {
    private String brush;
    private String paper;
    private String frame;
    protected  Shape(){};
    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    protected Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    
    public abstract String draw();
    
}
