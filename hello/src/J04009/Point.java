/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04009;

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

    public Point() {
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
    
    public double distance(Point p1, Point p2){
        double n = p1.x - p2.x;
        double m = p1.y - p2.y;
        return Math.sqrt(n*n + m*m);
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}
