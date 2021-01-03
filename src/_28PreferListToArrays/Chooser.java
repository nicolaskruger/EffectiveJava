package _28PreferListToArrays;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T>{
    private final List<T> choiceList;
    public Chooser(Collection<T> choices){
        choiceList = new ArrayList<>(choices);
    }
    public T choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
