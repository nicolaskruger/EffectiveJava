package _20PreferInterfaceToAbstract;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class skeletal {
    static List<Integer> intArrayAsList(int[] a){
        Objects.requireNonNull(a);
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }
            @Override public  Integer set(int i,Integer val){
                int oldval = a[i];
                a[i] = val;
                return oldval;
            }
            @Override
            public int size() {
                return a.length;
            }
        };
    }
}
