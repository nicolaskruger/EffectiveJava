package exep;

public class WeekdayException extends  Exception{
    public WeekdayException(String wday){
        super("Illegal weekday" + wday);
    }
}
