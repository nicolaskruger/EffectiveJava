package MyCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMembership {
    final static String[]keyworday ={
            "abstract", "assert", "boolean", "break", "byte",
    };
    final static Set keywordds= new HashSet(Arrays.asList(keyworday));
    static boolean isKeyword1(String id){
        return  keywordds.contains(id);
    }
    static boolean isKeyword2(String id){
        return Arrays.binarySearch(keyworday,id)>=0;
    }
}
