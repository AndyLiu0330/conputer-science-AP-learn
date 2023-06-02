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

public class ColorToGray {

    public static void main(String[] args) {
        Picture pic = new Picture("image/potentialColor.png");
        int width  = pic.width();
        int height = pic.height();
       
        //pic.show();
       
        // convert to grayscale
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = pic.get(col, row);
                Color gray = Luminance.toGray(color);
                pic.set(col, row, gray);
            }
        }
        pic.show();
    }

}