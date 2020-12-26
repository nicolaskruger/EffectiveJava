package myThread;

public class Incrementer extends  Thread{
    public int i;
    @Override
    public void run(){
        for(;;){
            i++;
            Thread.yield();
        }
    }
}
