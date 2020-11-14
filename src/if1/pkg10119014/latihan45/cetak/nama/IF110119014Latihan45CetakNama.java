/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan45.cetak.nama;

import java.util.Scanner;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * kelas: IF-1
 * NIM  : 10119014
 */
public class IF110119014Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    Printer cetakNama = new Printer();
    
    System.out.println("====Aplikasi Pencetakan Nama====");
    System.out.print("Masukan nama anda : ");
    String inputNama= "";
    inputNama+=scanner.nextLine();
    cetakNama.setNama(inputNama);
    String nama = cetakNama.getNama();
    
    System.out.print("Mau cetak nama berapa kali? : ");
    cetakNama.setjmlCetak(scanner.nextInt());
    int jmlCetak = cetakNama.getjmlCetak();
    scanner.close();
    
    cetakNama.cetak(nama);
    cetakNama.cetak(jmlCetak, nama);}
    
}
