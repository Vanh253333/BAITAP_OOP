/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhTienPhong;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<HoaDon> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            ds.add(new HoaDon(i, sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(), Integer.parseInt(sc.nextLine())));
            
        }
        Collections.sort(ds);
        for(HoaDon a: ds){
            System.out.println(a);
        }
    }
}
