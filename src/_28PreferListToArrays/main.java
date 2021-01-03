package _28PreferListToArrays;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in";//throws ArrayStoreException

//        List<Object> ol = new ArrayList<Long>(); // incompatibily type
//        List<String> [] string = new List<String>[2];
    }
}
