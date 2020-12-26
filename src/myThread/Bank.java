package myThread;

public class Bank {
    private int account1 = 10, account2 = 20;
    synchronized public void transfer(int amount) throws InterruptedException {
        int new1 = account1 -amount;
        Thread.sleep(10);
        account1 = new1;account2+=amount;
        System.out.println("Sum is "+(account1+account2));
    }
}
