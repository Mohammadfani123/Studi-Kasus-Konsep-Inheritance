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

public class DataPembeli extends DataBarang {
    private String idpembeli,namapembeli,alamat,telp;
    
    
    public DataPembeli(String idpembeli,String namapembeli,String alamat,String telp,String idbarang,String namabarang1,String namabarang2,String merk,String kasir){
        super(kasir,idbarang,namabarang1,namabarang2,merk);
        this.idpembeli = idpembeli;
        this.namapembeli = namapembeli;
        this.alamat = alamat;
        this.telp = telp;
    }
    
    
    
    public void info(){
        super.info();
        System.out.println("===========================");
        System.out.println("total harga  :Rp "+(getharga1()+getharga2()));
        System.out.println("===========================");
        System.out.println("ID pembeli   :"+idpembeli);
        System.out.println("Nama Pembeli :"+namapembeli);
        System.out.println("Alamat       :"+alamat);
        System.out.println("No. Telepon  :"+telp);
        System.out.println("===========================");
        
    }
}
