/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beweb.lunel.poo.theGame.entities;

import beweb.lunel.poo.theGame.entities.interfaces.ActionInterface;

/**
 *
 * @author alexandreplanque
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personnage[] domeDuTonnere = new Personnage[2];
        
        domeDuTonnere[0] = new Humain("Loïc");
        domeDuTonnere[1] = new Elfe("Jonathan"); 
        
        int fin = 1000;
        
        while(fin >= 0){
            double choix = Math.random();
            
            if(choix > 0.5){
                domeDuTonnere[0].attaquer(domeDuTonnere[1]);
                fin = domeDuTonnere[1].pv;
            }else{
                domeDuTonnere[1].attaquer(domeDuTonnere[0]);
                fin = domeDuTonnere[0].pv;
            }
        }
    }
    
    public static void action(ActionInterface object, Personnage cible){
        object.attaquer(cible);
        
    }
}
