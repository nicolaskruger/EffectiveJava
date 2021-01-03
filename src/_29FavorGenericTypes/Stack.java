package _29FavorGenericTypes;

import java.sql.Array;
import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int Size = 0;
    private static final int DEFAULT_iNITIAL_CAPACITY = 16;
    public Stack(){
        elements = new Object[DEFAULT_iNITIAL_CAPACITY];
    }
    public void push(Object e){
        ensureCapacity();
        elements[Size++] = e;
    }
    public Object pop(){
        if(Size == 0)
            throw  new EmptyStackException();
        Object result = elements[--Size];
        elements[Size] = null;
        return result;
    }
    public boolean isEmpty(){
        return Size==0;
    }
    private void ensureCapacity(){
        if(elements.length == Size)
            elements = Arrays.copyOf(elements,2*Size+1);
    }
}
