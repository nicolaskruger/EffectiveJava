public class StringOperator {
    static int ecount(String s){
    int ecount = 0;
    for (int i=0; i<s.length(); i++){
        if (s.charAt(i) == 'e')
            ecount++;
    }
    return ecount;
    }
    static boolean sorted(String[] a){
        for (int i=1; i<a.length; i++)
            if (a[i-1].compareTo(a[i]) > 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1 + "";
        String s3 = s1;
// New object, but contains same text as s1
// Same object as s1
        String s4 = s1.toString(); // Same object as s1
// The following statements print false, true, true, true, true:
        System.out.println("s1 and s2 identical objects: " + (s1 == s2));
        System.out.println("s1 and s3 identical objects: " + (s1 == s3));
        System.out.println("s1 and s4 identical objects: " + (s1 == s4));
        System.out.println("s1 and s2 contain same text: " + (s1.equals(s2)));
        System.out.println("s1 and s3 contain same text: " + (s1.equals(s3)));
// These two statements print 35A and A1025 because (+) is left-associative:
        System.out.println(10 + 25 + "A"); // Same as (10 + 25) + "A"
        System.out.println("A" + 10 + 25); // Same as ("A" + 10) + 25
        String res = "";
        for (int i=0; i<args.length; i++)
            res += args [i] ;
        System.out.println(res);
    }
}
