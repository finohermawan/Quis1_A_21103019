/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class Quis1 {

    public static void main(String[] args) {
        Mahasiswa_21103019 A = new Mahasiswa_21103019();
        Mahasiswa_21103019 B = new Mahasiswa_21103019();
        Dosen_21103019 C= new Dosen_21103019();
        Dosen_21103019 D= new Dosen_21103019();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("NIK     : ");
            A.NIK = br.readLine();
            System.out.println("Nama    : ");
            A.nama = br.readLine();
            System.out.println("Umur    : ");
            A.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            A.alamat = br.readLine();
            System.out.println("NIM     : ");
            A.nim = br.readLine();
            System.out.println("IPK     : ");
            A.ipk = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK     : ");
            B.NIK = br.readLine();
            System.out.println("Nama    : ");
            B.nama = br.readLine();
            System.out.println("Umur    : ");
            B.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            B.alamat = br.readLine();
            System.out.println("NIM     : ");
            B.nim = br.readLine();
            System.out.println("IPK     : ");
            B.ipk = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK             : ");
            C.NIK = br.readLine();
            System.out.println("Nama            : ");
            C.nama = br.readLine();
            System.out.println("Umur            : ");
            C.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            C.alamat = br.readLine();
            System.out.println("NIDN            : ");
            C.NIDN = br.readLine();
            System.out.println("Golongan        : ");
            C.gol = br.readLine();
            System.out.println("Gaji Pokok      : ");
            C.gajiPokok = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("NIK             : ");
            D.NIK = br.readLine();
            System.out.println("Nama            : ");
            D.nama = br.readLine();
            System.out.println("Umur            : ");
            D.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            D.alamat = br.readLine();
            System.out.println("NIDN            : ");
            D.NIDN = br.readLine();
            System.out.println("Golongan        : ");
            D.gol = br.readLine();
            System.out.println("Gaji Pokok      : ");
            D.gajiPokok = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("==== DATA MAHASISWA ====");
            A.tampilDataMahasiswa();
            A.tampilDataBeasiswa();
            System.out.println("");
            B.tampilDataMahasiswa();
            B.tampilDataBeasiswa();
            System.out.println("====== DATA DOSEN ======");
            C.tampilDataDosen();
            System.out.println("Total Pendapatan    : Rp "+C.totalPendapatan());
            System.out.println("");
            System.out.println("Total Pendapatan    : Rp "+D.totalPendapatan());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}

    
