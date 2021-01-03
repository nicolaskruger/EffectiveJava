package _29FavorGenericTypes;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackG <E>{
    private E[] elements;
    private int Size = 0;
    private static final int DEFAULT_iNITIAL_CAPACITY = 16;
    @SuppressWarnings("unchecked")
    public StackG(){
        elements = (E[])new Object[DEFAULT_iNITIAL_CAPACITY];
    }
    public void push(E e){
        ensureCapacity();
        elements[Size++] = e;
    }
    public E pop(){
        if(Size == 0)
            throw  new EmptyStackException();
        E result = elements[--Size];
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
