package myThread;

public class Buffer {
    private int contents;
    private boolean empty = true;

    public  int get(){
        synchronized (this){
            while (empty)
                try {
                    this.wait();
                }catch (InterruptedException x){

                }
            empty = true;
                this.notify();
                return  contents;
        }
    }
    public void  put(int v){
        synchronized (this){
            while (!empty)
                try {
                    this.wait();
                }catch (InterruptedException x){

                }
            empty = false;
                contents =v;
                this.notify();
        }
    }
}
