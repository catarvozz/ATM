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
public class TampilanFactory {
        public Tampilan getTampilan(String tampilType){
        if (tampilType == null)
            return null;
        
        if(tampilType.equalsIgnoreCase("Tampilan")){
            return new TampilanUtama();
        }
        else if(tampilType.equalsIgnoreCase("Tampilan1")){
            return new TampilanUtama1();
        }
        return null;
    }
}
