package Singleton;

public enum MichaelJackson {
    INSTANCE;
    public void moonWalker(){
        System.out.println("hehe");
    }

    public static void main(String[] args) {
        MichaelJackson.INSTANCE.moonWalker();
    }
}
