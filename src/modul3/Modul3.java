/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author Asus
 */
public class Modul3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlahbarang = 5, harga = 5000;
        Kasir k = new Kasir();
        k.setHarga(harga);
        k.setJumlahbarang(jumlahbarang);
        k.total();
    }
    
}
