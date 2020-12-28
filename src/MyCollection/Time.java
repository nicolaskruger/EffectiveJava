package MyCollection;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Time implements Comparable{

    public int hh,mm;
    public Time(int hh,int mm){
        this.hh= hh;
        this.mm = mm;
    }
    @Override
    public int compareTo(Object o) {
        Time t = (Time)o;
        return this.hh != t.hh?hh-t.hh:mm-t.mm;
    }
    public boolean equals(Object o){
        Time t = (Time) o;
        return this.hh==t.hh && this.mm==t.mm;
    }
    public int hachCode(){return 60*hh+mm;}

    public static void main(String[] args) {
        SortedMap datebook = new TreeMap();
// Map from Time to String
        datebook.put(new Time(12, 30), "Lunch");
        datebook.put(new Time(15, 30), "Afternoon coffee break");
        datebook.put(new Time( 9, 0), "Lecture");
        datebook.put(new Time(13, 15), "Board meeting");
        SortedMap pm = datebook.tailMap(new Time(12, 0));
        Iterator iter = pm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            System.out.println((Time)entry.getKey() + " " + (String)entry.getValue());
        }
    }
}
