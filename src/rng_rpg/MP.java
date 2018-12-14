/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rng_rpg;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import static javafx.scene.Cursor.cursor;
import javax.swing.JFrame;


/**
 *
 * @author 802709
 */
public class MP extends JPanel {

    static JFrame JFrame;
    
    final int marginX;
    final int marginY;
    private Cursor cursor;
    private Enemy enemy;
    private Timer timer;    
    private BufferedImage buttonImage;
    private Button button;
    private BufferedImage cursorImage;
    private Color color;
     public Graphics draw;
    public int dx;
    public int dy;
    
   
    public MP () {
        super ();
        marginX = 10;
        marginY = 10;
        dx = 0;
        dy = 0;
        timer = new Timer () ;      
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/20);
}

   public class cursor {

        private int dx;
        private int dy;
        private int x;
        private int y;
        
        //public cursor() {
           public int getX() {
        return x;
            
        }
    public int getY (){
        return y;
    }
    
       public void setDX (int dx) {
        this.dx = dx;
    }
    
      
      public void setDY(int dy) {
        this.dy = dy;
    }
      
      public void reverseX() {
      dx = -dx;
      move(3 * dx,dy);
    }
    
      
    public void reverseY() {
    dy = -dy;
      move(3 * dx,dy);
    }
    public void keyPressed(KeyEvent e) {
          if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              cursor.setDX(3);
          }
          else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              cursor.setDX(-3);
          }
           else if (e.getKeyCode() == KeyEvent.VK_UP) {
              cursor.setDY(-3);
          }
           else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              cursor.setDY(3);
          }
           

      }   
        public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            cursor.setDX(0);
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            cursor.setDX(0);
        if (e.getKeyCode() == KeyEvent.VK_UP)
            cursor.setDY(0);
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            cursor.setDY(0);
        }
        
        private void wallCollisions(cursor c) {
        //walls = this.getWidth(), 0 , this.getHeight(), 0 
        
        if (c.getX()<= 0 || c.getX() >= this.getWidth() ) {
            c.reverseX();
        }
         if (c.getY() <= 0 || c.getY() >= this.getHeight()) {
            c.reverseY();
        }
        //cursor's location = cursor.getX(), cursor.getY()
    }
        
        }
    

    /**
     *
     * @param g
     */
    
    
    
     
       
    
//       public void draw(Graphics g){
//        g.setColor (color);
//        Graphics rect = g.fillRect(x, y, size, size);
//    }
       
    
   
    
      private class ScheduleTask extends TimerTask {	    	   

       
        @Override
        public void run() {
            wallCollisions(cursor);

       // cursorOnButton.update();
          // buttonImage.update();
            button.update(draw);
            repaint();  
 
        }
      }
      

   
     @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        cursor.draw(g);

        
        
        //g.dispose();
    }     
      
       
     
//   
//    private void cursorOnButton () {
//        if (cursor.getX()+ 40 >= button.getX() && cursor.getY() + 40 >= button.getY()) {
//            if (cursor.getX() <= button.getX() + 40 && cursor.getY() <= button.getY() + 40) {
//             khdvbkbekvbkbkebvkkd
//            }
//        }
//       }
     //Makes the cursor and enemy bounce off walls  
    
            
            public String[] problems = {
                "8*9",
                "9*20",
                "500-90",
                "10/2",
                "4^2",
                "2/3",
                "10^3" ,
                "4^3",
                "2*8",
                "6*0",
                "66/3",
                "22/11",
                "10/10",
                "67+33",
                "100/10",
                "1000-599",
                "89+11",
                "3^2 - 9",
                "5^2",
                "7^2",
                "9^2",
                "9^3",
                "27/9",
                "72/9",
                "1000/100",
                "81/9",
                "99/9",
                "666/333",
                "777/111",
                "1^100",
                "0^999",
                "10^-1",
                "2^-1",
                "33^-3",
                "(33/3) / 11",
                "1000-560",
                "(100-31) / 3",
                "7*7",
                "8*12",
                "12*12",
                "13*1",
                "69/3",
                "42/0",
                "99/3",
                "1000^-3",
                "44 / (2^2)",
                "7*5",
                "3*2*10",
                "8*6",
                "12^2",
                "99^-3",
                "1^-1",
                "1/1",
                "0/0",
                "72/8",
                "32/8",
                "32/4",
                "32/2",
                "90/9",
                "999/999",
                "100000^-10",   
            };
            
//            public Timer timeLimit(){
//                
//            }
} 
    
