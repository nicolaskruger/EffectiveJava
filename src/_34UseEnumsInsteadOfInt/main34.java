package _34UseEnumsInsteadOfInt;

public class main34 {
    public static void ex01(){
        for (Planet p: Planet.values())
            System.out.println("Weight on " +p+ " is "+p.surfaceWeight(p.getMass())+"\n");
    }
    public static void ex02(){
        double x = 2;
        double y = 3;
        for (Operation op:Operation.values() )
            System.out.println(""+x + op + y +"="+ op.apply(x, y));
    }
    public static void main(String[] args) {
        ex02();
    }
}
