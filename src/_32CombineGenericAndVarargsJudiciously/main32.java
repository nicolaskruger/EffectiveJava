package _32CombineGenericAndVarargsJudiciously;

import java.util.ArrayList;
import java.util.List;

public class main32 {
    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>...lists){
        List<T> result = new ArrayList<>();
        for(List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }
}
