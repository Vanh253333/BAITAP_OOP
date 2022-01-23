/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05033;

/**
 *
 * @author HP
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ThoiGian> danhSach = new ArrayList<>();
        int t = sc.nextInt();
        while(t-- > 0){
            ThoiGian a = new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt());
            danhSach.add(a);
        }
        Collections.sort(danhSach);
        for(ThoiGian i: danhSach){
            System.out.println(i);
        }
    }
}
