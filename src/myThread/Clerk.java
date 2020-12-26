package myThread;

public class Clerk extends Thread{
    private Bank bank;
    public Clerk(Bank bank){
        this.bank = bank;
    }
    public void run(){
        for (;;){
            try {
                bank.transfer(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
