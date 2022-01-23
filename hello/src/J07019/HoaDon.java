/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07019;

/**
 *
 * @author HP
 */
public class HoaDon {
    private SanPham sp;
    private String maHD;
    private int sl;

    public HoaDon(int id, SanPham sp, String maHD, int sl) {
        this.sp = sp;
        this.maHD = chuanHoa(maHD, id);
        this.sl = sl;
    }
    
    private String chuanHoa(String s, int id){
        s += "-";
        s += String.format("%03d", id);
        return s;
    }
    
    private int loaiGia(){
        if(maHD.charAt(2) == '1')
            return sp.getGia1();
        else
            return sp.getGia2();
    }
    
    private long thanhTien(){
        return sl*this.loaiGia();
    }
    
    private long giamGia(){
        if(sl >= 150)
            return this.thanhTien()/2;
        else if(sl >= 100)
            return (this.thanhTien()*30)/100;
        else if(sl >= 50)
            return (this.thanhTien()*15)/100;
        else 
            return 0;
    }
    
    private long phaiTra(){
        return this.thanhTien() - this.giamGia();
    }

    @Override
    public String toString() {
        return maHD + " " + sp.getTen() + " " + this.giamGia() + " " + this.phaiTra();
    }
    
    
}
