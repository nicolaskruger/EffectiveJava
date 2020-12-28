package InputOutput;


import java.io.*;
import java.util.Timer;


public class Buffer {
    public static void main(String[] args) throws IOException {
        OutputStream os1 = new FileOutputStream("tmp1.dat");
        writeints("Unbuffered: ", 1000000, os1);
        OutputStream os2 = new BufferedOutputStream(new FileOutputStream("tmp2.dat"));
        writeints("Buffered: ", 1000000, os2);
        Writer wr1 = new FileWriter("tmp1.dat");
        writeints("Unbuffered: ", 1000000, wr1);
        Writer wr2 = new BufferedWriter(new FileWriter("tmp2.dat"));
        writeints("Buffered: ", 1000000, wr2);
    }

    private static void writeints(String msg, int count, OutputStream os) throws IOException {
        var t = System.nanoTime();
        for (int i=0; i < count; i++)
            os.write(i & 255);
        os. close();
        System.out .println (msg + (System.nanoTime()-t));
    }
    static void writeints(String msg, int count, Writer os) throws IOException {
        var t = System.nanoTime();
        for (int i=0; i < count; i++)
            os.write(i & 255);
        os.close();
        System.out.println(msg + (System.nanoTime()-t));
    }

}
