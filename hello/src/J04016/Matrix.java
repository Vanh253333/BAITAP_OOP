/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04016;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Matrix {
    private int soCot=50, soHang=50;
    private int maTran[][] = new int[soCot][soHang];
	
    public Matrix(int soHang, int soCot) {
	this.soCot=soCot;
	this.soHang=soHang;
    }
	
    public void nextMatrix(Scanner sc) {
	for(int i=0; i<soHang; i++) {
            for(int j=0; j<soCot; j++) {
		maTran[i][j]=sc.nextInt();
            }
	}
    }
    
    public Matrix trans() {
	Matrix b = new Matrix(soCot, soHang);
	for(int i=0; i<soCot; i++) {
            for(int j=0; j<soHang; j++) {
		b.maTran[i][j]=maTran[j][i];
            }
        }
	return b;
    }  
    
    public Matrix mul(Matrix b) {
	Matrix c = new Matrix(soHang, b.soCot);
	for(int i=0; i<soHang; i++) {
            for(int j=0; j<b.soCot; j++) {
		c.maTran[i][j]=0;
		for(int k=0; k<soCot; k++) {
                    c.maTran[i][j]+=maTran[i][k]*b.maTran[k][j];
                   }
            }
	}
	return c;
    }
   
    @Override
    public String toString() {
		String res = "";
	for(int i=0; i<soHang; i++) {
            for(int j=0; j<soCot; j++) {
		res+=String.format("%d ", maTran[i][j]);
            }
            res+="\n";
        }
	return res;
    }
}
