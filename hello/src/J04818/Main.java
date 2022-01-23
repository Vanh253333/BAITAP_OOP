/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04818;

import java.util.*;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc tmp = a.cong(b);
            SoPhuc c = tmp.nhan(a);
            SoPhuc d = tmp.nhan(tmp);
            System.out.println(c + ", " + d);
        }
    }
}
