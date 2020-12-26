package awt;

import java.awt.*;

public class ColoredRectangle implements ColoredDrawable{
    Color c;
    int x1,x2,y1,y2;
    public ColoredRectangle(int x1,int y1,int x2,int y2, Color c){
        this.x1=x1;this.x2=x2;this.y1=y1;this.y2=y2;this.c=c;
    }
    @Override
    public Color getColor() {
        return c;
    }

    @Override
    public void draw(Graphics g) {
    g.drawRect(x1,y1,x2-x1,y2-y1);
    }
}
