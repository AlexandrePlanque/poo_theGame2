/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beweb.lunel.poo.theGame.entities;

import beweb.lunel.poo.theGame.entities.interfaces.ActionInterface;
import beweb.lunel.poo.theGame.entities.interfaces.Initialisable;

/**
 *
 * @author alexandreplanque
 */
abstract public class Personnage implements  Initialisable,ActionInterface{
            
    int force;
    int pv;
    int endurance;
    String nom;
    
    public Personnage(){
        this.initAttributs();
    }
    
    public Personnage(String nom){
        this();
        this.nom = nom;
    }
    
    abstract public void initAttributs();
    
    
    @Override
    public void attaquer(Personnage cible){
        
        cible.pv = cible.pv - (this.force - cible.endurance);
        
        if(cible.pv <= 0){
            System.out.println(this.nom + " attaque " + cible.nom);
            System.out.println(cible.nom + " est mort !!!");
        }else{
            System.out.println(this.nom + " attaque " + cible.nom + ", il reste " + cible.pv + " points de vie !");
        }
        
    }  
}
