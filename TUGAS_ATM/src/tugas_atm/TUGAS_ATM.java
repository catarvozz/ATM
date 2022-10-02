/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_atm;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TUGAS_ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo = 500000;
        int min = 100000; 
        for (String lanjut="y";lanjut.equals("y")||lanjut.equals("Y");){
        System.out.println("===================================");
        System.out.println("          ATM BANK SALATIGA"        );
        System.out.println("===================================");
        //Factory1
        TampilanFactory tampilanFactory = new TampilanFactory();
        Tampilan tampil1 = tampilanFactory.getTampilan("Tampilan");
        tampil1.tampil();
        //Factory1
        Tampilan tampil2 = tampilanFactory.getTampilan("Tampilan1");
        tampil2.tampil();
        System.out.println("-----------------------------------");
        System.out.println("Pilih Menu: ");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Setor Tunai");
        Scanner _scanner= new Scanner(System.in);
        System.out.println("Masukkan pilihan: "); 
        int pilih = _scanner.nextInt();
        if (pilih==1) {
            //Singleton
             SingleObject object = SingleObject.getInstance();
             object.showMessage(saldo);
        } else if (pilih==2){
            //MVC
            System.out.println("Masukkan jumlah saldo yang ingin ditarik: ");
            int a= _scanner.nextInt();
                if(saldo > min){
                        if (a%50000  == 0){
                        saldo = saldo-a;
                        }
                        else {
                            System.out.println("Tarik Tunai Tidak Berhasil");
                            }
                        }
                    else {
                        System.out.println("Saldo Anda Kurang dari 100.000");     
                            }
                    Transaksi model= retriveTransaksiFromDatabase();
                    TransaksiView view = new TransaksiView();
                    TransaksiController controller = new TransaksiController(model, view);
                    controller.setSaldoNew(a);
                    controller.updateView();
        } else if (pilih==3){
            //MVC
            System.out.println("Masukkan jumlah yang ingin disetor: ");
            int a= _scanner.nextInt();
                    if (a%50000  == 0){
                    saldo = saldo+a;
                    Transaksi model= retriveTransaksiFromDatabase();
                    TransaksiView view = new TransaksiView();
                    TransaksiController controller = new TransaksiController(model, view);
                    controller.setSaldoNew(a);
                    controller.updateView();
                    }
                    else {
                        System.out.println("Setor Tunai Tidak Berhasil");
                    }
        }
        System.out.println("Lanjut y/t: ");
        lanjut= _scanner.next();
       }
    }
    private static Transaksi retriveTransaksiFromDatabase() {
                Transaksi transaksi = new Transaksi();
                transaksi.setSaldo(0);
                return transaksi;
    }
}
 