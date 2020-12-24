import java.util.ArrayList;

public class SPoint extends Point {

    private static ArrayList allpoints = new ArrayList();
    SPoint(int x,int y){
        super(x,y);
        allpoints.add(this);

    }
    int getIndex(){return allpoints.indexOf(this);}
    static int getSize(){return allpoints.size();}
    static SPoint getPoint(int i){return (SPoint) allpoints.get(i);}
}
