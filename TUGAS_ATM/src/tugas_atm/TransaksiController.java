/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_atm;

/**
 *
 * @author ASUS
 */
public class TransaksiController {
    private Transaksi model;
    private TransaksiView view;
    
    public TransaksiController (Transaksi model, TransaksiView view){
        this.model = model;
        this.view = view;
    }
    public void setSaldoNew(int saldo){
        model.setSaldo(saldo);
    }
    
    public int getSaldoNew(){
        return model.getSaldo();
    }
    
    public void updateView(){
        view.printTransaksiDetails(model.getSaldo());
    }
}

