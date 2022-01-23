/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05069;

/**
 *
 * @author HP
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CLB> dsCLB = new ArrayList<>();
        ArrayList<TranDau> dsTD = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            CLB x = new CLB(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            dsCLB.add(x);
        }
        
        int v = Integer.parseInt(sc.nextLine());
        while(v-- > 0){
            String s = sc.next();
            long sl = Long.parseLong(sc.next());
            String ma = s.substring(1, 3);
            for(CLB x: dsCLB){
                if(x.getMa().equals(ma)){
                    TranDau a = new TranDau(s, sl, x);
                    dsTD.add(a);
                    break;
                }
            }
        }
        Collections.sort(dsTD);
        for(TranDau x: dsTD){
            System.out.println(x);
        }
    }
}
