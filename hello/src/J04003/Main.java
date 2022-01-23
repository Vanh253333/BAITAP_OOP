/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04003;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo q = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo tong = p.cong(q);
        tong.rutGon();
        System.out.println(tong);
    }
}
