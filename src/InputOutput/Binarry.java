package InputOutput;

import java.io.*;

public class Binarry {
    public static void main(String[] args) throws IOException{
        DataOutputStream daos = new DataOutputStream(new FileOutputStream("tmpl.dat"));
        writedata(daos); daos.close();
        DataInputStream dais = new DataInputStream(new FileInputStream("tmpl.dat"));
        readdata(dais);
        RandomAccessFile raf = new RandomAccessFile("tmp2.dat", "rw");
        writedata(raf); raf.seek(0); readdata(raf);
    }
    static void writedata(DataOutput out) throws IOException {
        out.writeBoolean(true);
        out.writeByte(120); // Write 1 byte
        out.writeBytes("foo"); // Write 3 bytes
        out.writeBytes("fo"); // Write 2 bytes
        out.writeChar('A'); // Write 2 bytes
        out.writeChars("foo");
        out.writeDouble(300.1);
        out.writeFloat(300.2F);
        out.writeInt(1234);
        out.writeLong(12345L);
        out.writeShort(32000);
        out.writeUTF("foo");
        out.writeUTF("Rhône");
        out.writeByte(-1);
        out.writeShort(-1);
    }
    static void readdata(DataInput in) throws IOException {
        byte[] buf1 = new byte[3];
        System.out.print(
                in.readBoolean());
        System.out.print(" " + in.readByte());
        in.readFully(buf1);
        in.readFully(buf1, 0, 2);
        System.out.print(" " + in.readChar());
        System.out.print(" " + in.readChar()+in.readChar()+in.readChar());
        System.out.print(" " + in.readDouble());
        System.out.print(" " + in.readFloat());
        System.out.print(" " + in.readInt());
        System.out.print(" " + in.readLong());
        System.out.print(" " + in.readShort());
        System.out.print(" " + in.readUTF());
        System.out.print(" " + in.readUTF());
        System.out.print(" " + in.readUnsignedByte());
        System.out.print(" " + in.readUnsignedShort()); // Read 2 bytes
        System.out.println();
    }
}
