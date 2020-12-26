import awt.*;
import myThread.*;
import org.w3c.dom.html.HTMLAppletElement;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class main extends Canvas {

    public static void main(String[] args) throws Exception {
        buffer();
    }
    public static void buffer(){
        Buffer buf = new Buffer();
        Thread t1 = new Thread(()->{
           System.out.println(buf.get());
        });
        Thread t2 = new Thread(()->{
           buf.put(3);
        });
        t1.start();
        t2.start();
    }
    public static void bank(){
        Bank bank = new Bank();
        new Clerk(bank).start();
        new Clerk(bank).start();
    }
    public static void  print(){
        Printer[] print = {
                new Printer(),
                new Printer(),
        };
        for (Printer printer : print) {
            printer.start();
        }

    }
    public static void incement(){
        Incrementer u = new Incrementer();
        u.start();
        for (;;){
//            System.in.read();
            System.out.println(u.i);
        }
    }

}
