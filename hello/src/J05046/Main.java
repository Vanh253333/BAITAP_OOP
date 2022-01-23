/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05046;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Hang> ds = new ArrayList<>();
        Map<String,Integer> maHang = new HashMap<>();
    
        for(int i = 1; i <= n; i++){
            String ten = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            int donGia = Integer.parseInt(sc.nextLine());
            String ma = chuanHoa(ten);
            if(maHang.containsKey(ma)){
                maHang.replace(ma, maHang.get(ma)+1);
                ma += (maHang.get(ma));
            }
            else{
                maHang.put(ma, 1);
                ma += 1;
            }
            Hang a = new Hang(ma,ten, sl, donGia);
            ds.add(a);
        }
        Collections.sort(ds);
        for(Hang i : ds){
            System.out.println(i);
        }
        
        
    }
    
    static String chuanHoa(String s){
        String ds[] = s.toUpperCase().split(" ");
        String ma = "" + ds[0].charAt(0) + ds[1].charAt(0) + 0;
        return ma.toString();
    }
    
}
