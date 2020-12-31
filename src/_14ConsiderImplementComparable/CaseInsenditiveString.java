package _14ConsiderImplementComparable;

import java.util.Objects;

public class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {
    private final String s;
    public CaseInsensitiveString(String s){
        this.s = Objects.requireNonNull(s);
    }
    @Override public boolean equals(Object o){
        return o instanceof _10equals.CaseInsensitiveString &&
                ((_10equals.CaseInsensitiveString)o).s.equalsIgnoreCase(s);
    }

    
}