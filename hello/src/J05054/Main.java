/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05054;

/**
 *
 * @author HP
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> ds = new ArrayList<>();
        ArrayList<HocSinh> xh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i =1; i <= t; i++){
            HocSinh x = new HocSinh(i, sc.nextLine(), Float.parseFloat(sc.nextLine()));
            ds.add(x);
            xh.add(x);
        }
        
        Collections.sort(xh);
        for(HocSinh i : ds){
            System.out.print(i + " ");
            for(int j = 0; j < xh.size(); j++){
                if(i.getDiemTB() == xh.get(j).getDiemTB()){
                    System.out.println(j+1);
                    break;
                }   
            }
        }
    }
}
