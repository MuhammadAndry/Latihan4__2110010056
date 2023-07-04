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
public class Mahasiswa {
    private String Npm;
    private String Nama;
    private String nama;

    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.Nama = nama;
    }
    
    public String getnpm() {
        return Npm;
    }
    
    public  Mahasiswa(String npm) {
        this.Npm = npm;
    }

}    
    
