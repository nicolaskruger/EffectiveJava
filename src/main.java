import awt.*;
import myThread.*;
import org.w3c.dom.html.HTMLAppletElement;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class main extends Canvas {

    public static  void STBuffer(){
        String str[] = {
                "hello",
                " word",
                " ola",
                " mundo"
        };
        StringBuffer res = new StringBuffer();
        for (String s : str) {
            res.append(s);
            System.out.println(res.toString());
        }
    }
    public static String CL(){
        String s = "elefant";
        StringBuffer res = new StringBuffer();
        char cl = 'e';
        String s2 = "E";
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==cl){
                res.append(s2);
            }else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) throws Exception {
        System.out.println(CL());
    }


}
