package _10equals;

import java.util.Objects;

public class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{
    private final String s;

    public CaseInsensitiveString(String s){
        this.s = Objects.requireNonNull(s);
    }
    @Override public boolean equals(Object o){
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString)o).s.equalsIgnoreCase(s);
    }
    @Override
    public int compareTo(CaseInsensitiveString o) {
        return String.CASE_INSENSITIVE_ORDER.compare(s,o.s);
    }

}
