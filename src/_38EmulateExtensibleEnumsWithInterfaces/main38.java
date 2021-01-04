package _38EmulateExtensibleEnumsWithInterfaces;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class main38 {
    private static void test(Collection<? extends Operation> opSet,
                             double x, double y) {
        for (Operation op : opSet)
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
    private static <T extends Enum<T> & Operation> void test(
        Class<T> opEnumType,double x, double y
    ){
        for (Operation op: opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f%n",
                    x,op,y,op.apply(x,y));
    }
    public static void main(String[] args) {
        List<Operation> lis =Arrays.asList(ExtendedOperation.values());

        test(lis,2,3);
    }
}
