package _23PreferClassHierarchiesToTaggedClasses;

public class Rectangle extends AFigure{
    final double length;
    final double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override double area(){
        return length*width;
    }
}
