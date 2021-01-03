package _34UseEnumsInsteadOfInt;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operation {
    PLUS("+") {public double apply(double x,double y){return x+y;}},
    MINUS("-") {public double apply(double x,double y){return x-y;}},
    TIMES("*") {public double apply(double x,double y){return x*y;}},
    DIVIDE("/") {public double apply(double x,double y){return x/y;}};
    public abstract double apply(double x,double y);
    private final  String symbol;
    Operation(String symbol){this.symbol=symbol;}

    @Override
    public String toString() {
        return  symbol ;
    }
    private static final Map<String,Operation> stringToEnum =
            Stream.of(values()).collect(
                    Collectors.toMap(Object::toString, e->e)
            );
    public static Optional<Operation> fromString(String symbol){
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
