/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07010;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String ma, ten, lop;
    private Date ns;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ns, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }
 
}
