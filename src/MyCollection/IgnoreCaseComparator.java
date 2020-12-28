package MyCollection;

public class IgnoreCaseComparator {
    public int compare(Object o1,Object o2){
        String s1 = (String) o1,s2 = (String) o2;
        int res = s1.compareToIgnoreCase(s2);
        if(res != 0)
            return res;
        return s1.compareTo(s2);
    }
}
