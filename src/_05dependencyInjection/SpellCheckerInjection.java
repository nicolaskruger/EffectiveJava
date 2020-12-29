package _05dependencyInjection;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SpellCheckerInjection {
    private final String dictionary;
    public SpellCheckerInjection(String dic){
        this.dictionary = Objects.requireNonNull(dic);
    }
    public boolean isValid(String word){return false;}
    public List<String> suggestions(String typo){
        return Arrays.asList("Inio","Asano");
    }
}
