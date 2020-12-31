package _14ConsiderImplementComparable;

import java.util.Comparator;

public class exComp {
    static Comparator<Object> hashCodeOrder = new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            return Integer.compare(o1.hashCode(),o2.hashCode());
        }
    };
    static  Comparator<Object> hash =
            Comparator.comparingInt(o->o.hashCode());
}
