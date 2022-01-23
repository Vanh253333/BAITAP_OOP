/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05050;

/**
 *
 * @author HP
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, loaiSD;
    private int cu, moi;

    public KhachHang(int id, String loaiSD, int cu, int moi) {
        this.ma = "KH" + String.format("%02d", id);
        this.loaiSD = loaiSD;
        this.cu = cu;
        this.moi = moi;
    }
    
    private int heSo(){
        if(loaiSD.equals("KD"))
            return 3;
        else if(loaiSD.equals("NN"))
            return 5;
        else if(loaiSD.equals("TT"))
            return 4;
        else return 2;
    }
    
    private long thanhTien(){
        return (moi - cu) * heSo() * 550;
    }
    
    private long phuTroi(){
        int k = moi - cu;
        if(k >= 50 && k <= 100)
            return (long)Math.round((thanhTien()*35)/100.0);
        else if(k > 100)
            return thanhTien();
        else 
            return 0;
    }
    
    private Long tongTien(){
        return phuTroi() + thanhTien();
    }

    @Override
    public String toString() {
        return ma + " " + heSo() + " " + thanhTien() + " " + phuTroi() + ' ' + tongTien();
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.tongTien().compareTo(this.tongTien());
    }
    
    
}
