/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05052;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> ds = new ArrayList<>();
        while(t-->0){
            DonHang a = new DonHang(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(a);
        }
        
        Collections.sort(ds);
        for(DonHang i : ds){
            System.out.println(i);
        }
    }
    
}
