/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan45.cetak.nama;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * kelas: IF-1
 * NIM  : 10119014
 */
class Printer {
 private int jmlCetak;
 private String nama;
 
 public int getjmlCetak(){
     return this.jmlCetak;
 }
 public void setjmlCetak(int jmlCetak){
     this.jmlCetak = jmlCetak;
 }
 public String getNama(){
     return this.nama;
 }
 public void setNama(String nama){
     this.nama = nama;
 }
 public void cetak(String nama){
     System.out.println("Nama anda : " + nama);
 }
 public void cetak (int jmlCetak, String nama){
     System.out.println("Hasil Cetak");
     for (int i = 1; i <= jmlCetak; i++){
         System.out.println(i + ". " + nama);
     }
 }
}
