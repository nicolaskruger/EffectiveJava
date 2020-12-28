package InputOutput;

import java.io.*;
import java.util.*;

public class Random {
    static void writeStrings(String filename, Iterator strIter)
            throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filename, "rw");
        raf.setLength(0);
        ArrayList offsettable = new ArrayList();
        while (strIter.hasNext()) {
            offsettable.add(new Long(raf.getFilePointer())); // Store string offset
            raf.writeUTF( (String)strIter.next());
        }
        Iterator iter = offsettable.iterator();
        while (iter.hasNext())
            raf.writeLong(((Long)iter.next()).longValue());
        raf.writeInt(offsettable.size());
        raf.close();
    }
    static String readOneString(String filename, int i) throws IOException {
        final int INTSIZE = 4, LONGSIZE = 8;
        RandomAccessFile raf = new RandomAccessFile(filename, "r");
        raf.seek(raf.length() - INTSIZE);
        int N = raf.readInt() ;
        raf.seek(raf.length() - INTSIZE - LONGSIZE * N + LONGSIZE * i);
        long si = raf.readLong();
        raf.seek(si);
        String s = raf.readUTF();
        raf.close();
        return s;
    }
    public static void main(String[] args) throws IOException {
        List l = Arrays.asList("meu","nome","eh","nicolas");
        writeStrings("01.txt",l.iterator());
        readOneString("01.txt",0);
    }
}
