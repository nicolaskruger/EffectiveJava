package InputOutput;

import java.io.*;
import java.text.DecimalFormat;

public class Table {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("temperature.html"));
        DecimalFormat ff = new DecimalFormat("#0"), cf = new DecimalFormat("0.0");
        pw.println("<TABLE BORDER><TR><TH>Fahrenheit<TH>Celsius</TR>");
        for (double f=100; f<=400; f+=10) {
            double c = 5 * (f - 32) / 9;
            pw.println("<TR ALIGN=RIGHT><TD>" + ff.format(f) + "<TD>" + cf.format(c));
        }
        pw.println("</TABLE>");
        pw.close();
    }
}
