/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04001;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point a) {
        this.x = a.x;
        this.y = a.y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double distance(Point p){
        double n = this.x - p.x;
        double m = this.y - p.y;
        return Math.sqrt(n*n + m*m);
    }
    
   
    
    
    
}
