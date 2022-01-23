/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05012;

/**
 *
 * @author HP
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<MayLanh> ds = new ArrayList<>();
        while(t-- > 0){
            MayLanh a = new MayLanh(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            ds.add(a);
        }
        
        Collections.sort(ds);
        for(MayLanh a: ds){
            System.out.println(a);
        }
    }
}
