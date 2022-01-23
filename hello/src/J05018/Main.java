/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05018;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            HocSinh a = new HocSinh(i, sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        for(HocSinh a: ds){
            System.out.println(a);
        }
    }
}
