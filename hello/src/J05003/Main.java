/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05003;

/**
 *
 * @author HP
 */
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            SinhVien a = new SinhVien(i, sc.nextLine(),sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
        System.out.println(a);
        }
        
        
    }
}
