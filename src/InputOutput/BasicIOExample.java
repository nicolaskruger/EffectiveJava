package InputOutput;

import java.io.*;

public class BasicIOExample {
    public static void ex01() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String s = r.readLine();
        while (s != null && !s.equals ("")) {
            count++;
            s = r.readLine();
            System.out.println(s);
        }
        System.out.println("You entered " + count + " nonempty lines");
    }
    public static void  writefile001() throws IOException {
        PrintWriter pwr = new PrintWriter(new FileWriter("f.txt"));
        pwr.print(4711); pwr.print(' '); pwr.print("cool"); pwr.close();
    }
    public static void  readfile001() throws IOException {
        StreamTokenizer stok = new StreamTokenizer(new FileReader("f.txt"));
        int tok = stok.nextToken();
        while (tok != StreamTokenizer.TT_EOF)
        { System.out.println(stok.sval); tok = stok.nextToken (); }
    }
    public static void  writefile002() throws  IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("p.dat"));
        dos.writeInt(4711); dos.writeChar(' '); dos.writeUTF("cool"); dos.close();
    }
    public static void readfile002() throws  IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("p.dat"));
        System.out.println(dis.readInt()+"|"+dis.readChar()+"|"+ dis.readUTF());
    }
    public static void writefile003() throws IOException{
        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("o.dat"));
        oss.writeObject(new int[]{2,3,5,7,11});oss.close();
    }
    public static void readfile003() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("o.dat"));
        int [] ia = (int[]) (ois.readObject());
        System.out.println(ia[0]+","+ia[1]+","+ia[2]+","+ia[3]+","+ia[4]);
    }
    public static void  readwritefile001() throws  IOException{
        RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
        raf.writeDouble(3.1415); raf.writeInt(42);
        raf.seek(0); System.out.println(raf.readDouble() + " " + raf.readInt());
    }
    public static void readFromStrng()throws IOException{
        Reader r = new StringReader("abc");
        System.out.println("abc: " + (char)r.read() + (char)r.read() + (char)r.read());
    }
    public static void writeForString()throws  IOException{
        Writer sw = new StringWriter();
        sw.write('d'); sw.write('e'); sw.write('f');
        System.out.println(sw.toString());
    }
    public static void writeStandartOutErr()throws  IOException{
        System.out.println("std output"); System.err.println("std error");
    }
    public static void readForStandartInput() throws IOException{
        System.out.print("Type some characters and press Enter: ");
        BufferedReader bisr = new BufferedReader(new InputStreamReader(System.in));
        String response = bisr.readLine();
        System.out.println(response);
    }
    public static void readByteFromStandatInput()throws IOException{
        System.out.print("Type one character and press Enter: ");
        byte b = (byte)System.in.read();
        System.out.println("First byte of your input is: " + b);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        readByteFromStandatInput();
    }
}
