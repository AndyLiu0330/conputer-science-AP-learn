/******************************************************************************
 *  Compilation:  javac Grayscale.java
 *  Execution:    java Grayscale filename
 *
 *  Reads in an image from a file, converts it to grayscale, and
 *  displays it on the screen.
 *
 *  % java Grayscale image.jpg
 *
 ******************************************************************************/

import java.awt.Color;

public class Grayscale {
    /**
     *  to brighten or darken a image. 
     *  
     *  @param brightnewssIncrease : positive number to brighten, negative number to darken
     */
    public static Color brighten(Color gray, int row, int col, int brightnessIncrease){
            int blue = gray.getBlue();
            int red = gray.getRed();
            int green = gray.getGreen();
            //System.out.println("Before Row: "+row+" Col: "+col+"--"+red+" "+green+" "+blue); 
            blue  += brightnessIncrease; if (blue>255) blue = 255;   if (blue<0) blue = 0;   
            red   += brightnessIncrease; if (red>255) red = 255;     if (red<0) red = 0;   
            green += brightnessIncrease; if (green>255) green = 255; if (green<0) green = 0;     
            //System.out.println("After  Row: "+row+" Col: "+col+"--"+red+" "+green+" "+blue); 
            Color newgray = new Color(red, blue, green);
            return newgray; 
    }
    
    public static void main(String[] args) {
        Picture pic = new Picture("image/potentialGray.png");
        int width  = pic.width();
        int height = pic.height();
        //System.out.println(width+" "+height);
        pic.show();
        Picture pic2 = new Picture("image/potentialGray.png"); 
        //pic2.show(); 
        // convert to grayscale
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color gray = pic.get(col, row);
               
                Color newgray = brighten(gray, row, col, -100);  
                pic2.set(col, row, newgray);
            }
        }
        pic2.show();
    }

}