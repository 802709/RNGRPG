/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rng_rpg;

/**
 *
 * @author 802709
 */
import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author 802709
 */
public class Enemy extends Character{
     public Enemy(){
     super ();
     health = 100;
     }
     public Enemy(int x, int y, Color color, int size, String name, BufferedImage charImage){
        super(x,y,color,size,name,charImage);
    health = 100;
     }

//    Enemy(int i, int i0, Color RED, int i1, String enemy) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
        @Override
    public void update() {
        super.setDX( (int) (Math.random()*10) - 4 );
        super.setDY( (int) (Math.random()*10) - 4 );
        super.update();
    }
    
    public int getHealth(){
       return health; 
    }
         
}
