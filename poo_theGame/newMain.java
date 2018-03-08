/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beweb.lunel.poo.theGame.entities;
/**
 *
 * @author cantinelli
 */
public class newMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Personnage[] domeDuTonnere = new Personnage[2];
        
        domeDuTonnere[0] = new Humain("Loïc");
        domeDuTonnere[1] = new Elfe("Jonathan"); 
        
        int fin = 1000;
        
        while(fin > 0){
            double choix = Math.random();
            
            if(choix > 0.5){
                domeDuTonnere[0].attaquer(domeDuTonnere[1]);
                fin = domeDuTonnere[1].pv;
            }else{
                domeDuTonnere[1].attaquer(domeDuTonnere[0]);
                fin = domeDuTonnere[0].pv;
            }
        }

        
        while(domeDuTonnere[0].pv > 0){
            domeDuTonnere[1].attaquer(domeDuTonnere[0]);
        }
        
    } 
}
