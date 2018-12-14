/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rng_rpg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elizabeth Mertens
 */
public class Hero extends Character {
 
    //fields 
    //(Variables/attributes) (defines things)

    private int health;
    
    //constructor
    public Hero(){
     super ();
     health=500;
    }
    
//    public Hero(int x, int y, Color color, int size, String name, BufferedImage charImage){
//        super(x,y,color,size,name,charImage);
//        health=500;
//    }
//
//    Hero(int i, int i0, Color CYAN, int i1, String dude) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
    
    
    public int getHealth(){
       return health; 
    }
            

   public void choice() {
        
    }
   
    public void attack() {
        
    }
    
    public void defend () {
        
    }
    

    private void run () {
       
    }
    
    
}
