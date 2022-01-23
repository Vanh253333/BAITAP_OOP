/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th1;

/**
 *
 * @author HP
 */
import java.util.*;

public class LuaChonThamLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(min(n, s) + " " + max(n, s));
    }
    
    static String max(int n, int s){
        if(s == 0 || s > 9*n)
            return "-1";
        String res = "";
        int count = 0;
        while(s > 9){
            res += "9";
            s -= 9;
            count++;
        }
        if(s > 0){
            res += Integer.toString(s);
            count++;
        }
        while(count < n){
            res += "0";
            count++;
        }
        return res;
    }
    
    static String min(int n, int s){
        if(s == 0 || s > 9*n)
            return "-1";
        Stack<Integer> a = new Stack<>();
        s -= 1;
        while(s > 9){
            a.push(9);
             s -= 9;
        }
        if(a.size() == n-1)
            a.push(s+1);
        else{
            a.push(s);
            while(a.size() < n-1)
                a.push(0);
            a.push(1);
        }
        String res = "";
        while(!a.empty())
            res += Integer.toString(a.pop());
        
        return res;
    }
}
