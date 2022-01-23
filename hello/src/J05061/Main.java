/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05061;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhuHo> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            PhuHo a = new PhuHo(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds.add(a);
        }
        
        //Collections.sort(ds);
        for(PhuHo i: ds){
            System.out.println(i);
        }
    }
}
