package _08AvoidFinalizerAndCleaners;

public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)){
            System.out.println("Goodbye");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
