package _30FavorGenericMethods;

import java.util.*;
import java.util.function.UnaryOperator;

public class main30 {
    public static <E>Set<E> union(Set<E> s1,Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction(){
        return (UnaryOperator<T>) IDENTITY_FN;
    }
    public static <E extends Comparable<E>> E max(Collection<E> c){
        if(c.isEmpty())
            throw  new IllegalArgumentException("Empty collection");
        E result = null;
        for(E e : c)
            if(result == null || e.compareTo(result)>0)
                result = Objects.requireNonNull(e);
            return result;
    }
    public static void ex01(){
        Set<String> guys = Set.of("Tom","Dick","Harry");
        Set<String> stooges = Set.of("Larry","Moe","Curly");
        Set<String> aflCio = union(guys,stooges);
        System.out.println(aflCio);
    }
    public static void  ex02(){
        String[] strings = {"jute","hemp","nylon"};
        UnaryOperator<String> sameString = identityFunction();
        for (String s : strings)
            System.out.println(sameString.apply(s));
        Number[] numbers = {1,2.0,3l};
        UnaryOperator<Number> sameNumber = identityFunction();
        for(Number n:numbers)
            System.out.println(sameNumber.apply(n));
    }
    public static void  ex03(){

        System.out.println(max(Arrays.asList(1,2,3)));
    }
    public static void main(String[] args) {
        ex03();
    }
}
