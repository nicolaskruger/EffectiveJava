package _05dependencyInjection;

import java.util.Arrays;
import java.util.List;

public class SpellChecker {
    private static final String dictionary ="";
    private SpellChecker(){
        throw new AssertionError();
    }
    public boolean isValid(String word){return false;}
    public List<String> suggestions(String typo){
        return Arrays.asList("down","below");
    }
}
