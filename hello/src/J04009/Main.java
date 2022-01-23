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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double AB = a.distance(b);
            double BC = b.distance(c);
            double AC = a.distance(c);
            if((AB + AC > BC) && (AB + BC > AC) && (AC + BC > AB)){
                double s = (0.25) * Math.sqrt((AB + AC + BC)*(AB + AC - BC)*(AB + BC - AC)*(-AB + AC + BC));
                double r = (AB*AC*BC)/(4*s);
                double s1 = r*r*Math.PI;
                System.out.println(String.format("%.3f", s1));
            }else{
                System.out.println("INVALID");
            }
        }
    }
}
