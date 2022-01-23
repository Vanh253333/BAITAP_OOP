/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05010;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ds = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            MatHang a = new MatHang(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(a);
        }
        
        Collections.sort(ds);
        for(MatHang a: ds){
            System.out.println(a);
        }
    }
}
