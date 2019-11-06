/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan51.gajikaryawan;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran =  hadir * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan){
        switch (jabatan) {
            case "Manager":
                tunjanganJabatan = 2000000;
                break;
            case "manager":
                tunjanganJabatan = 2000000;
                break;
            case "Kabag":
                tunjanganJabatan = 1000000;
                break;
            case "kabag":
                tunjanganJabatan = 1000000;
                break;
            default:
                tunjanganJabatan = 0;
                break;
        }
        return tunjanganJabatan;
    }
    
    public float tunjangnGolongan(int golongan){
        switch(golongan){
            case 1 : 
                tunjanganGolongan = 500000;
                break;
            case 2 : 
                tunjanganGolongan = 1000000;
                break;
            case 3 : 
                tunjanganGolongan = 1500000;
                break;
            default: 
                tunjanganGolongan = 0;
                break;
        }
        return tunjanganGolongan;
        
    }
}
