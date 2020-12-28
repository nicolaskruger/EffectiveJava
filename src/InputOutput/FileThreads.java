package InputOutput;

import java.io.*;

public class FileThreads {
    static void showDir(int indent, File file) throws IOException {
        for (int i=0; i<indent; i++)
            System.out.print('-');
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i=0; i<files.length; i++)
                showDir(indent+4, files[i]);
        }
    }
    static void  threads() throws IOException {
        PipedOutputStream outpipe = new PipedOutputStream();
        PipedInputStream inpipe = new PipedInputStream(outpipe);
        final DataOutputStream outds = new DataOutputStream(outpipe);
        DataInputStream inds = new DataInputStream(inpipe);
        class Producer extends Thread {
            public void run() {
                try {
                    outds.writeInt(2);
                    for (int p=3; true; p+=2) {
                        int q=3;
                        while (q*q <= p && p%q != 0)
                            q+=2;
                        if (q*q > p)
                        { outds.writeInt(p); System.out.print("."); }
                    }
                } catch (IOException e) { System.out.println("<terminated>: " + e); }
            }
        }
        new Producer().start();
        for (;;) {
            for (int n=0; n<10; n++)
            System.out.print(inds.readInt() + " "); // and
            System.in.read();
        }
    }

    public static void main(String[] args) throws IOException {
//        showDir(3,new File("src"));
        threads();
    }
}
