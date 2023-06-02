import java.awt.Color;
/**
 * Write a description of class ShowColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShowColor
{
    public static void main(String[] args) {
        Picture pic = new Picture("image/potentialColor.png");
        int width  = pic.width();
        int height = pic.height();
        //System.out.println(width+" "+height);
        pic.show();
    }
}
