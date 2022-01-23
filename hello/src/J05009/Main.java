/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05009;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ThiSinh a = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        float k = ds.get(0).getTong();
        for(ThiSinh i: ds){
            if(i.getTong() == k)
                System.out.println(i);
            else
                break;
        }
    }
}
