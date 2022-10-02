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
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    
    private SingleObject(){}
    
    public static SingleObject getInstance(){
    return instance;
    }
     public void showMessage(int saldo){
         System.out.println("Jumlah saldo anda saat ini: "+saldo);
         System.out.println(" ");
     }
}
