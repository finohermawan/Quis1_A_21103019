/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1;

/**
 *
 * @author Asus
 */
public class Dosen_21103019 extends Penduduk_21103019 {
    String NIDN,gol;
    int gajiPokok,tunjangan;
    double gajitotal;
    
    public double totalPendapatan(){
        switch(gol){
            case "IIIA":
                tunjangan = 300000;
            break;
            case "IIIB":
                tunjangan = 500000;
            break;
            case "IIIC":
                tunjangan = 700000;
            break;
        }
        gajitotal = gajiPokok + tunjangan;
        return gajitotal;
    }
    public void tampilDataDosen(){
        tampilDataPenduduk();
        System.out.println("NIDN        : "+NIDN);
        System.out.println("Golongan    : "+gol);
        System.out.println("Gaji Pokok  : "+gajiPokok);
    }
}
