/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 
 */
public class PBOUL10115229Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager karyawan;
        karyawan = new Manager();
        System.out.println("==== Program Perhitungan Gaji Karyawan ====");
        System.out.print("Masukan NIK : ");
        Scanner snik = new Scanner(System.in);
        String nik = snik.nextLine();
        karyawan.setNik(nik);
        
        System.out.print("Masukan Nama : ");
        Scanner snm = new Scanner(System.in);
        String nama = snm.nextLine();
        karyawan.setNama(nama);
        
        System.out.print("Masukan Golongan (1/2/3) : ");
        Scanner sgol = new Scanner(System.in);
        int gol = sgol.nextInt();
        karyawan.setGolongan(gol);
        
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        Scanner sjb = new Scanner(System.in);
        String jabatan = sjb.nextLine();
        karyawan.setJabatan(jabatan);
        
        System.out.print("Jumlah Kehadiran : ");
        Scanner skh = new Scanner(System.in);
        int hadir = skh.nextInt();
        karyawan.setKehadiran(hadir);
        
        System.out.println("\n==== Hasil Perhitungan ====");
        System.out.println("NIK      : "+karyawan.getNik());
        System.out.println("NAMA     : "+karyawan.getNama());
        System.out.println("GOLONGAN : "+karyawan.getGolongan());
        System.out.println("JABATAN  : "+karyawan.getJabatan()+"\n");
        System.out.println("TUNJANGAN GOLONGAN  : "+karyawan.tunjangnGolongan(gol));
        System.out.println("TUNJANGAN JABATAN   : "+karyawan.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN : "+karyawan.tunjanganKehadiran(hadir));
    }
    
}
