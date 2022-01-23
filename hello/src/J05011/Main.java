/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05011;

/**
 *
 * @author HP
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TinhGio> ds = new ArrayList<>();
        while(n-- > 0){
            TinhGio a = new TinhGio(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        for(TinhGio i : ds){
            System.out.println(i);
        }
    }
}
