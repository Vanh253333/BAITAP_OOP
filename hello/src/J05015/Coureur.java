/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05015;

/**
 *
 * @author HP
 */
public class Coureur implements Comparable<Coureur>{
    private String ma, ten, dv, tg;

    public Coureur(String ten, String dv, String tg) {
        this.ma = chuanHoa(dv, ten);
        this.ten = ten;
        this.dv = dv;
        this.tg = tg;
    }
    
    private String chuanHoa(String s1, String s2){
        String tmp[] = (s1 + " " + s2).toUpperCase().split(" ");
        String res = "";
        for(int i = 0; i < tmp.length; i++){
            res += tmp[i].charAt(0);
        }
        return res;
    }
    
    private Double vanToc(){
        String s[] = tg.split(":");
        double gio = (Integer.parseInt(s[0])-6)+Integer.parseInt(s[1])/60.0;
        double kq = 120.0/gio;
        return kq;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dv + " " + Math.round(vanToc()) + " Km/h";
    }

    @Override
    public int compareTo(Coureur o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return o.vanToc().compareTo(vanToc());
    }
    
    
}
