/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasusPewarisan;

/**
 *
 * @author Windows 10
 */
class DataBarang {
    
    private String namabarang1,namabarang2,merk,idbarang,kasir;
    private int hargabarang;
    private int hargabarang2;
   
    
    public DataBarang(String kasir,String idbarang,String namabarang1,String namabarang2,String merk){
        this.kasir = kasir;
        this.idbarang = idbarang;
        this.namabarang1 = namabarang1;
        this.namabarang2 = namabarang2;
        this.merk = merk;
        
    }
    
    public void setharga1(int hargabarang){
        this.hargabarang = hargabarang;
        
    }
     public int getharga1(){
        return hargabarang;
    }
     
     public void setharga2(int hargabarang2){
        this.hargabarang2 = hargabarang2;
    }
   
    public int getharga2(){
        return hargabarang2;
    }
    
    
    
    public void info(){
        System.out.println("Nota Pembelian Toko Makmur");
        System.out.println("==========================");
        System.out.println("Nama Kasir   :"+this.kasir);
        System.out.println("Tanggal      :28/09/2018");
        System.out.println("==========================");
        System.out.println("ID barang    :"+idbarang);
        System.out.println("Nama Barang 1:"+namabarang1);
        System.out.println("Harga 1      :Rp "+hargabarang);
        System.out.println("Merk         :"+merk);
        System.out.println("Nama Barang 2:"+namabarang2);
        System.out.println("Harga 2      :Rp "+hargabarang2);
        
    }
   
}
