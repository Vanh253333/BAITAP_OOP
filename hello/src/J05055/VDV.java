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
public class VDV implements Comparable<VDV>{
    private String ma, hoTen, ns, thoiGianXP, thoiGianDD;

    public VDV(int id, String hoTen, String ns, String thoiGianXP, String thoiGianDD) {
        this.ma = "VDV" + String.format("%02d", id);
        this.hoTen = hoTen;
        this.ns = ns;
        this.thoiGianXP = thoiGianXP;
        this.thoiGianDD = thoiGianDD;
    }
    
    private int tuoi(){
        String ds[] = ns.split("/");
        return 2021 - Integer.parseInt(ds[2]);
    }
    
    private String uuTien(){
        if(this.tuoi() >= 32)
            return "00:00:03";
        else if(this.tuoi() >= 25)
            return "00:00:02";
        else if(this.tuoi() >= 18)
            return "00:00:01";
        else
            return "00:00:00";
    }
    
    private String xuLy(String x, String y){
        String[] a = x.split(":");
        String[] b = y.split(":");
        int giayA = Integer.parseInt(a[0]) * 3600 + Integer.parseInt(a[1]) * 60 + Integer.parseInt(a[2]);
        int giayB = Integer.parseInt(b[0]) * 3600 + Integer.parseInt(b[1]) * 60 + Integer.parseInt(b[2]);
        int tmp = giayB - giayA;
        int hh = tmp/3600;
        int mm = (tmp - hh*3600)/60;
        int ss = (tmp - hh*3600 - mm*60);
        return String.format("%02d", hh) + ":" + String.format("%02d", mm) + ":" + String.format("%02d", ss);
    }
    
    private String thanhTichTT(){
        return xuLy(thoiGianXP, thoiGianDD);
    }
    
    private String thanhTichUT(){
        return xuLy(uuTien(), thanhTichTT());
    }    

    @Override
    public int compareTo(VDV o) {
        String s1[] = this.thanhTichUT().split(":");
        String s2[] = o.thanhTichUT().split(":");
        if(s1[0].equals(s2[0])){
            if(s1[1].equals(s2[1]))
                return s1[2].compareTo(s2[2]);
            return s1[1].compareTo(s2[1]);
        }
        return s1[0].compareTo(s2[0]);
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + ' ' + thanhTichTT() + " " + uuTien() + " " + thanhTichUT();
    }
    
    public String getTT(){
        return this.thanhTichUT();
    }
}
