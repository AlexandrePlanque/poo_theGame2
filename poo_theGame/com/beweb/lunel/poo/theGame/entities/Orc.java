/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beweb.lunel.poo.theGame.entities;
/**
 *
 * @author alexandreplanque
 */
public class Orc extends Personnage {
    
    public Orc(){
   
    } 

    public Orc(String nom) {
        super(nom);
    }
    
    @Override
    public void initAttributs() {
        this.force = 8;
        this.pv = 87;
        this.endurance = 0; 
    }
}
