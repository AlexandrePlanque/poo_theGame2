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
public class Elfe extends Personnage {
            
    public Elfe(){ 

    }

    public Elfe(String nom) {
        super(nom);
    }
    
    @Override
    public void initAttributs() {
        this.force = 4;
        this.pv = 80;
        this.endurance = 1;     
    }
    
}
