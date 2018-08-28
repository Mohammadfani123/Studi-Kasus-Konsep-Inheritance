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

public class TestToko {
    public static void main(String[] args){
        DataPembeli p = new DataPembeli("001","Paiman","JL.Danau Buyan","085123123123"
                                        ,"011","Buku Sidu","Penggaris","Kit","Fani");  
        p.setharga1(5000);
        p.setharga2(2000);
        p.info();
        
        
    } 
}
