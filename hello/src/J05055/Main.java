/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05055;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<VDV> ds = new ArrayList<>();
        List<VDV> xh = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            VDV x = new VDV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(x);
            xh.add(x);
        }
        Collections.sort(ds);
        Collections.sort(xh);
        for(VDV i : ds){
            System.out.print(i + " ");
            for(int j = 0; j < xh.size(); j++){
                if(i.getTT().equals(xh.get(j).getTT())){
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
    
}
