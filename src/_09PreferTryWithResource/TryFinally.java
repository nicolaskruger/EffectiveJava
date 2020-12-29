package _09PreferTryWithResource;

import java.io.*;

public class TryFinally {
    static String firstLineOfFile(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        }finally {
            br.close();
        }
    }
    static String firstLineOfFile_(String path) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }catch (IOException err){
            return "";
        }
    }
    static void copy(String src,String dst)throws IOException{
        try (InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst)){
            byte [] buf = new byte[500];
            int n;
            while ((n = in.read(buf))>=0)
                out.write(buf,0,n);
        }
    }
    public static void main(String[] args) throws IOException {
//        System.out.println(firstLineOfFile("ex.txt"));
//        System.out.println(firstLineOfFile_("ex.txt"));
        copy("ex.txt","exit.txt");

    }
}
