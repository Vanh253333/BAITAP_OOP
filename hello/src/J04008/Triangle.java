/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04008;

/**
 *
 * @author HP
 */
public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        double AB = a.distance(b);
        double BC = b.distance(c);
        double AC = a.distance(c);
        if((AB + AC > BC) && (AB + BC > AC) && (AC + BC > AB))
            return true;
        return false;
    }
    
    public String getPerimeter(){
        double p = a.distance(b) + b.distance(c) + a.distance(c);
        return String.format("%.3f", Math.round(p*1000.0)/1000.0);
    }
}
