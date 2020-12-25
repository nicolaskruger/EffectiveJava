import java.util.Arrays;

public class InitializeExample {
    static  double [] ps = new double[6];
    static{
        ps = Arrays.stream(ps).map(p->{
            var val = Math.random();
            return val;
        }).toArray();
        double sum = Arrays.stream(ps).sum();
        ps = Arrays.stream(ps).map(p->p/sum).toArray();
    }
}
