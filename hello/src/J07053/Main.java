/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07053;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
   public static void main(String[] args) throws FileNotFoundException {
	Scanner sc = new Scanner(new File("XETTUYEN.in"));
	int t = Integer.parseInt(sc.nextLine());
	ArrayList<ThiSinh> ds = new ArrayList<>();
	for(int i=1; i<=t; i++) {
            ThiSinh a = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds.add(a);
	}
	for(ThiSinh a : ds) {
            System.out.println(a);
	}
    }
}
