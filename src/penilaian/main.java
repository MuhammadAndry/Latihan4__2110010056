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
public class main {
    public static void main(String[] args) {
        mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Muhammad Andry Romadhon Arifin");
        mahasiswa.setNpm("2110010056");
        
        NilaiAkhir nilaiAkhir = new NilaiAkhir();
        nilaiAkhir.setUts(89);
        nilaiAkhir.setUas(60);
        nilaiAkhir.setTugas(50);
        
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
        System.out.println("Nilai UTS: " + nilaiAkhir.getUts());
        System.out.println("Nilai UAS: " + nilaiAkhir.getUas());
        System.out.println("Nilai Tugas: " + nilaiAkhir.getTugas());
        System.out.println("Nilai Akhir: " + nilaiAkhir.hitungNilaiAkhir());
    }
    
}
