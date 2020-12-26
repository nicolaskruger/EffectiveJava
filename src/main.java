import awt.*;
import org.w3c.dom.html.HTMLAppletElement;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class main extends Canvas {
    static void pritcolors(Colored[] cs){
        for (Colored c : cs) {
            System.out.println(c.getColor().toString());
        }
    }
    static void draw(Graphics g,ColoredDrawable[] cs){
        for (ColoredDrawable c : cs) {
            g.setColor(c.getColor());
            c.draw(g);
        }
    }
    public void paint(Graphics g){
        ColoredDrawable[] dra ={
                new ColoredDrawablePoint(0,0,new Color(0x565693)),
                new ColoredRectangle(0,0,200,200,new Color(0xFD820B)),
        };
        draw(g,dra);
    }
    public static void main(String[] args) {
        Colored[] colors ={
                new ColoredDrawablePoint(0,0,new Color(0x565693)),
                new ColoredPoint(0,0,new Color(0xF35172)),
                new ColoredRectangle(0,0,2,2,new Color(0xFD820B)),
        };

        pritcolors(colors);
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new main();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
//        draw(a,dra);
    }
}
