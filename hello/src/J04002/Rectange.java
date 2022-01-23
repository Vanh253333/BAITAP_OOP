/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04002;

/**
 *
 * @author HP
 */
public class Rectange {
    private double width, height;
    private String color;

    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = chuanHoa(color);
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public double findArea(){
        return width*height;
    }
    
    public double findPerimeter(){
        return (width+height)*2;
    }
    
    private String chuanHoa(String s){
        s = s.toLowerCase();
        s = (s.charAt(0)+"").toUpperCase() + s.substring(1);
        return s;
    }

    @Override
    public String toString() {
        return (int)findPerimeter() + " " + (int)findArea() + " " + getColor();
    }
    
    
}
