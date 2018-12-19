/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rng_rpg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Button;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

/**
 *
 * @author 802709
 */
public class Character {
    //no-args Consturctor
    int x;
    int y;
    private int dx;
    private int dy;
    Color color;
    int size;
    String name;
    BufferedImage charImage;
     private BufferedImage monster;
    int health;
    
    //constructor
    public Character(){
        x = 0;
        y = 0;
        dx=0;
        dy=0;
        color = Color.CYAN;
        size = 50;
        name = "enemy";
        charImage = monster;
        health = 100;
    }
    public Character(int x, int y, Color color, int size, String name, BufferedImage charImage){
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
        this.size = 20;
        this.name = name;
        dx=0;
        dy=0;
        this.name = "dude";
        this.charImage = monster;
        this.health = 100;
    }
    public Character(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //Getters
    public int getX() {
        return x;
            
        }
    public int getY (){
        return y;
    }
        
    public Color getColor () {
        return color;
    }
    
    public int getSize (){
        return size;
    }
    public String getName (){
        return name; 
    }
        
    //Setters
    public void setX(int x){
        this.x = x;
    }   
    public void setY(int y){
        this.y = y;
    }   
    
      public void setDX(int dx) {
        this.dx = dx;
    }
      
       public void setDY(int dy) {
        this.dy = dy;
    }
      
    public void setColor(Color color){
        this.color = color;
    }   
    
    public void setSize(int size){
        this.size = size;
    } 
    
    public void setName (String name){
        this.name = name;
    }   
    
    public void setHealth(int health){
        this.health = health;
    }

    
    
    
    
    public void draw(Graphics g){
        g.setColor (color);
        g.fillRect(x, y, size, size);
    }
    
    public void kill(Character c) {
       c.setSize(0);
//       JFrame.EXIT;
    }
    
    public void move (int dx, int dy) {
        x += dx * 3;
        y += dy * 3;
    }
      public void update() {
        move(dx, dy);
    }   
      
    public void reverseX() {
      dx = -dx;
      move(3 * dx,dy);
    }
    
      
    public void reverseY() {
    dy = -dy;
      move(3 * dx,dy);
    }
   

}
