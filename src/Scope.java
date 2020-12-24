import java.util.Arrays;
import java.util.List;

public class Scope {
    public static void main(String[] args) {
        int a,b,c;
        int x = 1,y=2,z=3;

        int ratio = z/x;
        final int maxyz = Arrays.asList(z,y,x).stream().max(Integer::compare).get();
        final double PI = 3.14;

        boolean found = false;

    }
}
