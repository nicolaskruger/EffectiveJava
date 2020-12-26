package awt;

import java.awt.*;

public class ColoredPoint extends Points implements Colored{

    Color c;
    public ColoredPoint(int x,int y,Color c){
        super(x,y);
        this.c = c;
    }

    @Override
    public Color getColor() {
        return this.c;
    }
}
