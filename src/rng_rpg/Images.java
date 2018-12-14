/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rng_rpg;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
/**
 *
 * @author 802709
 */
public class Images {
    public static void img (String args[]){
        try{
            BufferedImage img = new BufferedImage( 
                500, 500, BufferedImage.TYPE_INT_RGB );

            File f = new File("MyFile.png");
            int r = 5;
            int g = 25;
            int b = 255;
            int col = (r << 16) | (g << 8) | b;
            for(int x = 0; x < 500; x++){
                for(int y = 20; y < 300; y++){
                    img.setRGB(x, y, col);
                }
            }
            ImageIO.write(img, "PNG", f);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

