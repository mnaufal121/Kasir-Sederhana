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
public class Kasir {
    private int jumlahbarang;
    private int harga;

    /**
     * @return the jumlahbarang
     */
    public int getJumlahbarang() {
        return jumlahbarang;
    }

    /**
     * @param jumlahbarang the jumlahbarang to set
     */
    public void setJumlahbarang(int jumlahbarang) {
        this.jumlahbarang = jumlahbarang;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
 
    public void total(){
    Diskon d = new Diskon();
    double hargaTotal = jumlahbarang*harga - d.hitung(this);
    //double hargaTotal = jumlahbarang*harga - ((this.getHarga() * 10 / 100) * this.getJumlahbarang());
    System.out.println("Harga Total "+jumlahbarang+" = "+hargaTotal);
}
}
class Diskon {
    /*int hitung(Kasir k){
        int hargaSekarang = k.getHarga();
        int jumlah = k.getJumlahbarang();
        return(hargaSekarang * 10 / 100)*jumlah;
    }*/
    int hitung(Kasir k){
        return(k.getHarga() * 10 / 100)*k.getJumlahbarang();
    }
}
