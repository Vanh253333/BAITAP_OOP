/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07018;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            SinhVien a = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            System.out.println(a);
        }
    }
}
