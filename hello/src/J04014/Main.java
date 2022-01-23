/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04014;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = a.tinhC(b);
            c.rutGon();
            PhanSo d = a.tinhD(b, c); 
            d.rutGon();
            System.out.println(c + " " + d);
            
        }
    }
}
