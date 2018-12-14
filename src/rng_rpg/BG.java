/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rng_rpg;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author 802709
 */
public class BG extends JPanel {
    
    final int marginX;
    final int marginY;
    private Hero hero;
    private Enemy enemy;
    private Timer timer;    
    
    public BG () {
        super ();
        marginX = 10;
        marginY = 10;
        BufferedImage monster = null;
        BufferedImage charImage = monster;
        hero = new Hero(600, 480, Color.CYAN, 20, "dude", charImage);
        enemy = new Enemy (50, 50, Color.RED, 20, "Enemy");
        timer = new Timer () ;      
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/20);
}
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        

         g.setColor(Color.GREEN);

//         
//         drawGreenDots(g);
         
         hero.draw(g);
         enemy.draw(g);
         //hero.kill();
        //g.dispose();
    }         
      private class ScheduleTask extends TimerTask {	    	   
        @Override
        public void run() {
            wallCollisions(hero);
            wallCollisions(enemy);
            heroVsEnemy ();
            hero.update();
            enemy.update();
            repaint();  
        
        }
      }
      public void keyPressed(KeyEvent e) {
          if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              hero.setDX(3);
          }
          else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              hero.setDX(-3);
          }
           else if (e.getKeyCode() == KeyEvent.VK_UP) {
              hero.setDY(-3);
          }
           else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              hero.setDY(3);
          }
           
           else if (e.getKeyCode() == KeyEvent.VK_D) {
              hero.setDX(3);
          }
           else if (e.getKeyCode() == KeyEvent.VK_A) {
              hero.setDX(-3);
          }
            else if (e.getKeyCode() == KeyEvent.VK_W) {
              hero.setDX(-3);
          }
            else if (e.getKeyCode() == KeyEvent.VK_S) {
              hero.setDY(3);
          } 
      }   
        public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            hero.setDX(0);
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            hero.setDX(0);
        if (e.getKeyCode() == KeyEvent.VK_UP)
            hero.setDY(0);
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            hero.setDY(0);
        if (e.getKeyCode() == KeyEvent.VK_W)
            hero.setDY(0);
        if (e.getKeyCode() == KeyEvent.VK_A)
            hero.setDY(0);
        if (e.getKeyCode() == KeyEvent.VK_S)
            hero.setDY(0);
        if (e.getKeyCode() == KeyEvent.VK_D)
            hero.setDY(0);
        }
    
    
    
//   public void drawGreenDots(Graphics g) {
//       int x = 0;
//       int y = 0;
//       for (int i  =  0;  i < 100; i++) {
//       
//       int rand1 = (int) (Math.random() * 960)  ;
//       int rand2 = (int) (Math.random() * 1200)  ;
//       
//        x = rand1 ;
//        y = rand2;
//        
//        g.fillOval (x , y , 10, 10);
//        
//        Color curr = g.getColor();
//          if (x % 2 == 0) 
//              g.setColor(curr.brighter());
//          else
//              g.setColor(curr.darker());
//          g.fillOval(x, y, 3, 3);
//        
//        
//        System.out.println(rand1+" "+rand2);   
//        }
//        }
    
    
//   
   
     //Makes the hero and enemy bounce off walls  
    private void wallCollisions(Character c) {
        //walls = this.getWidth(), 0 , this.getHeight(), 0 
        
        if (c.getX()<= 0 || c.getX() >= this.getWidth() ) {
            c.reverseX();
        }
         if (c.getY() <= 0 || c.getY() >= this.getHeight()) {
            c.reverseY();
        }
    }
    
    
    
     private void battleEvent() {
              hero.setX(100);
            hero.setY(500);
            enemy.setX(600);
            enemy.setY(500);
                //MP.JFrame.open;
         MPMain.setVisible(true);
            }
     
      private void heroVsEnemy () {
        if (hero.getX()+ 40 >= enemy.getX() && hero.getY() + 40 >= enemy.getY()) {
            if (hero.getX() <= enemy.getX() + 40 && hero.getY() <= enemy.getY() + 40) {
              //  battleEvent() = true;
             
            }
        }
       }
      
        }
       


    
