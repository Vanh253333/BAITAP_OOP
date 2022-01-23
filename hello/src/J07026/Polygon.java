/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07026;


/**
 *
 * @author HP
 */
public class Polygon {
    private Point p[];

    public Polygon(Point[] p) {
        this.p = p;
    }

    public String getArea(){
        double area = 0.0;
        int j = p.length - 1;
        for(int i = 0; i < p.length; i++){
            area += (p[i].getX() + p[j].getX())*(p[j].getY() - p[i].getY());
            j = i;
        }
        return String.format("%.3f", Math.abs(area/2));
    }
    
}
