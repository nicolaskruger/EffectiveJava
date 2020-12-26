package awt;

import java.awt.*;

public class ColoredDrawablePoint extends  ColoredPoint implements ColoredDrawable{
    public ColoredDrawablePoint(int x, int y, Color c) {
        super(x, y, c);
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(x,y,100,100);
    }
}
