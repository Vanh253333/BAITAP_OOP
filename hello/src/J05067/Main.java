/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05067;

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
	for(int i=0; i<t; i++) {
            String[] s = (sc.nextLine()).split(" ");
            MatHang a = new MatHang(s[0], Integer.parseInt(s[1]));
            ds.add(a);
        }
        Collections.sort(ds);
	for(MatHang a : ds) {
            System.out.println(a);
            }
	}
    
}
