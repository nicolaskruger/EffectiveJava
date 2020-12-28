package InputOutput;

import java.io.*;

public class Token {
    static void sumfile(String filename) throws IOException {
        Reader r = new BufferedReader(new FileReader(filename));
        StreamTokenizer stok = new StreamTokenizer(r);
//        stok.eolIsSignificant(false);
        stok.parseNumbers();
        double sum = 0; stok.nextToken() ;
        while (stok.ttype != StreamTokenizer.TT_EOF) {
            if (stok.ttype == StreamTokenizer.TT_NUMBER)
                sum += stok.nval;
            else
                System.out.println("Nonnumber: " + stok.sval);
            stok.nextToken();
        }
        System.out.println("The file sum is " + sum);
    }
    static void sumlines(String filename) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader(filename));
        lnr.setLineNumber(0);
        StreamTokenizer stok = new StreamTokenizer(lnr);
        stok.parseNumbers();
        stok.eolIsSignificant(true);
        stok.nextToken();
        while (stok.ttype != StreamTokenizer.TT_EOF) {
            int lineno = lnr.getLineNumber();
            double sum = 0;
            while (stok.ttype != StreamTokenizer.TT_EOL &&
                    stok.ttype != StreamTokenizer.TT_EOF) {
                if (stok.ttype == StreamTokenizer.TT_NUMBER)
                    sum += stok.nval;
                stok.nextToken();
            }
            System.out.println("Sum of line " + lineno + " is " + sum);
            stok.nextToken();
        }
    }
    public static void main(String[] args) throws IOException {
        sumlines("sum.txt");
    }
}
