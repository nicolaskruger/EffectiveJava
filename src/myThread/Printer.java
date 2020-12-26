package myThread;

import jdk.jshell.execution.Util;

public class Printer extends Thread{
    static Object mutex = new Object();
    public void run(){
        for(;;){
            synchronized (mutex){
                System.out.print("-");
                try{
                    Thread.sleep(300);
                }catch (Exception ex){

                }
                System.out.print("/");
            }
            try{
                Thread.sleep(300);
            }catch (Exception ex){

            }
        }
    }
}
