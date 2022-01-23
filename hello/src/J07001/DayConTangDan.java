/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07001;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DayConTangDan {
    public static void main(String[] args) throws FileNotFoundException {
	Scanner sc = new Scanner(new File("DAYSO.in"));
	int n = Integer.parseInt(sc.nextLine());
	int a[] = new int[n], b[] = new int[n+1];
	String s[] = sc.nextLine().trim().split(" ");
	for(int i=0; i<n; i++) {
            a[i]=Integer.parseInt(s[i]);
	}
	b[0]=-1;
	ArrayList<String> ds = new ArrayList<>();
	duyetNp(n, a, b, 1, 0, ds);
	Collections.sort(ds);
        for(String x : ds) {
            System.out.println(x);
        }
    }

    private static void duyetNp(int n, int[] a, int[] b, int count, int vt, ArrayList<String> ds) {
	if(count>=3) {
            String s="";
            for(int i=1; i<count; i++) {
		s+=b[i]+" ";
            }
            ds.add(s.trim());
	}
	for(int i=vt; i<n; i++) {
            if(b[count-1]<a[i]) {
		b[count]=a[i];
		count++;
		duyetNp(n, a, b, count, i+1, ds);
		count--;
            }
        }
		
    }
}
