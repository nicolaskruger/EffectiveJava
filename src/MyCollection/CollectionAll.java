package MyCollection;

import java.io.*;
import java.util.*;
import java.util.Collection;
public class CollectionAll {
    static void  traverse(Collection col){
        for (Object obj:
             col) {
            System.out.println(obj);
        }
        System.out.println();
    }
    static void t01(Collection col){
        Iterator iter = col.iterator();
        while (iter.hasNext()){
            String elem = (String) iter.next();
            System.out.println(elem+" ");
        }
        System.out.println();
    }
    static void oper(){
        List list1 = new LinkedList();
        list1.add("list");list1.add("dup");list1.add("dup");
        //traverse(list1);
        List /* of String */ list2 = new ArrayList();
        list2.add("list"); list2.add("dup"); list2.add("x"); list2.add("dup");
//        traverse(list2);
        // Must print: list dup x dup
        Set /* of String */ set1 = new HashSet();
        set1.add("set"); set1.add("dup"); set1.add("x"); set1.add("dup");
//        traverse(set1);// May print: x dup set
        SortedSet /* of String */ set2 = new TreeSet();
        set2.add("set"); set2.add("dup"); set2.add("x"); set2.add("dup");
//        traverse(set2);
        LinkedHashSet /* of String */ set3 = new LinkedHashSet();
        set3.add("set"); set3.add("dup"); set3.add("x"); set3.add("dup");
//        traverse(set3);
        Map /* from String to String */ ml = new HashMap();
        ml.put("map", "J"); ml.put("dup", "K"); ml.put("x", "M"); ml.put("dup", "L");
//        traverse(ml.keySet()); // May print: x dup map
//        traverse(ml.values());
        SortedMap /* from String to String */ m2 = new TreeMap();
        m2.put("map", "J"); m2.put("dup", "K"); m2.put("x", "M"); m2.put("dup", "L");
//        traverse(m2.keySet()); // Must print: dup map x
//        traverse(m2.values());
        LinkedHashMap /* from String to String */ m3 = new LinkedHashMap();
        m3.put("map", "J"); m3.put("dup", "K"); m3.put("x", "M"); m3.put("dup", "L");
        traverse(m3.keySet()); // Must print: map dup x
        traverse(m3.values());
    }
    static SortedMap buildIndex(String filename) throws IOException{
        Reader r = new BufferedReader(new FileReader(filename));
        StreamTokenizer stok = new StreamTokenizer(r);
        stok.quoteChar('"'); stok.ordinaryChars('!', '/');
        stok.nextToken();
        SortedMap index = new TreeMap();
// Map from String to Set of Integer
        while (stok.ttype != StreamTokenizer.TT_EOF) {
            if (stok.ttype == StreamTokenizer.TT_WORD) {
                SortedSet ts;
                if (index.containsKey(stok.sval))
// If word has a set, get it
                    ts = (SortedSet)index.get(stok.sval);
                else {
                    ts = new TreeSet();
// Otherwise create one
                    index.put(stok.sval, ts);
                }
                ts.add(new Integer(stok.lineno()));
            }
            stok.nextToken();
        }
        return index;
    }
    static void read(){
        try {
            SortedMap map = buildIndex("teste.txt");
//            System .out.println(map);
            printeIndex(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void  printeIndex(SortedMap index){
        Iterator wordlter = index.entrySet().iterator();
        while (wordlter.hasNext()){
            Map.Entry entry = (Map.Entry)wordlter.next();
            System.out.println((String) entry.getKey()+": ");
            SortedSet lineNoSet = (SortedSet)entry.getValue();
            Iterator lineNoIter = lineNoSet.iterator();
            while (lineNoIter.hasNext())
                System.out.print((Integer)lineNoIter.next() + " ");
            System.out.println();

        }
    }
    static Set intersectionClose(Set SS) {
        LinkedList worklist = new LinkedList(SS);
        Set TT = new HashSet();
        while (!worklist.isEmpty()) {
            Set S = (Set)worklist.removeLast();
            Iterator TTIter = TT.iterator();
            while (TTIter.hasNext()) {
                Set TS = new TreeSet((Set)TTIter.next());
                TS.retainAll(S);// Intersection of T and S
                if (!TT.contains(TS))
                    worklist.add(TS);
            }
            TT.add(S);
        }
        return TT;
    }
    static Map mkRenamer(Collection states) {
        Map renamer = new HashMap();
        Iterator iter = states.iterator();
        while (iter.hasNext()) {
            Set k = (Set)(iter.next());
            renamer.put(k, new Integer(renamer.size()));
        }
        return renamer;
    }
    public static void main(String[] args) {
       var name = Arrays.asList("nicolas","kruger");
       var let = mkRenamer(name);
       System.out.println(let);
    }

}
