/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
	Scanner sc = new Scanner(new File("KHACH.in"));
	int t = Integer.parseInt(sc.nextLine());
	ArrayList<KhachHang> ds = new ArrayList<>();
	for(int i=1; i<=t; i++) {
            KhachHang a = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
	}
	Collections.sort(ds);
	for(KhachHang a : ds) {
		System.out.println(a);
        }
    }
}
