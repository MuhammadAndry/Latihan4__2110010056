/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian;

/**
 *
 * @author User
 */
public class NilaiAkhir {
     private int uts;
    private int uas;
    private int tugas;
    
    public int getUts() {
        return uts;
    }
    
    public void setUts(int uts) {
        this.uts = uts;
    }
    
    public int getUas() {
        return uas;
    }
    
    public void setUas(int uas) {
        this.uas = uas;
    }
    
    public int getTugas() {
        return tugas;
    }
    
    public void setTugas(int tugas) {
        this.tugas = tugas;
    }
    
    public int hitungNilaiAkhir() {
        
        double bobotUts = 7;
        double bobotUas = 7;
        double bobotTugas = 8;
        
        return (int) ((uts * bobotUts) + (uas * bobotUas) + (tugas * bobotTugas));
    }    
    
}
