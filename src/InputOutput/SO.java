package InputOutput;

import java.io.*;

public class SO implements Serializable {
    int i;SC c;
    SO(int i,SC c){this.i=i;this.c =c;}
    void cprint(){
        System.out.println("i" + i + "c" + c.ci + " ");
    }
    public static void ex01() throws IOException, ClassNotFoundException {
        File f = new File("objects.dat");
        SC c = new SC();
        SO o1 = new SO(1, c), o2 = new SO(2, c);
        o1.c.ci = 3; o2.c.ci = 4; // Update the shared c twice
        o1.cprint(); o2.cprint(); // Prints: i1c4 i2c4
        OutputStream os = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(o1); oos.writeObject(o2); oos.close();
        InputStream is = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(is);
        SO o1i = (SO)(ois.readObject()), o2i = (SO)(ois.readObject());
        o1i.cprint(); o2i.cprint(); // Prints: i1c4 i2c4
        o1i.c.ci = 5; o2i.c.ci = 6; // Update the shared c twice
    }
    public static void ex02() throws IOException, ClassNotFoundException {
        File f = new File("objects.dat");
        SC c = new SC();
        SO o1 = new SO(1, c), o2 = new SO(2, c);
        o1.c.ci = 3; o2.c.ci = 4; // Update the shared c twice
        o1.cprint(); o2.cprint(); // Prints: i1c4 i2c4
        OutputStream os = new FileOutputStream(f);
        ObjectOutputStream oos1 = new ObjectOutputStream(os);
        oos1.writeObject(o1); oos1.flush();
        ObjectOutputStream oos2 = new ObjectOutputStream(os);
        oos2.writeObject(o2); oos2.close();
        InputStream is = new FileInputStream(f);
        ObjectInputStream ois1 = new ObjectInputStream(is);
        SO o1i = (SO)(ois1.readObject());
        ObjectInputStream ois2 = new ObjectInputStream(is);
        SO o2i = (SO)(ois2.readObject());
        o1i.cprint();
        o2i.cprint(); // Prints: i1c4 i2c4
        o1i.c.ci = 5; o2i.c.ci = 6; // Update two different c's
        o1i.cprint();
        o2i.cprint(); // Prints: i1c5 i2c6
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ex02();
    }
}
