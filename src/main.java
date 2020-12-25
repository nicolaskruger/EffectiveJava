import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        var point = new Point(1,2);
        point = new Point(2,1);
        var val = InitializeExample.ps[0];
        TLC tlc = new TLC();
        TLC.SMC smc = new TLC.SMC();
        Iterator seq = suffixes("teste");
        while (seq.hasNext())
            System.out.println(seq.next());
    }
    static Iterator suffixes(final String s){
//        class SuffixIterator implements  Iterator{
//            int i =0;
//            public boolean hasNext(){return i<s.length();}
//            public Object next(){return s.substring(i++);}
//        }
//        return new SuffixIterator();
        return new Iterator() {
            int i =0;
            @Override
            public boolean hasNext() {
                return i<s.length();
            }

            @Override
            public Object next() {
                return s.substring(i++);
            }
        };
    }
}
