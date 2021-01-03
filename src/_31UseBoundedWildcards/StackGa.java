package _31UseBoundedWildcards;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class StackGa  <E>{
    private E[] elements;
    private int Size = 0;
    private static final int DEFAULT_iNITIAL_CAPACITY = 16;
    @SuppressWarnings("unchecked")
    public StackGa(){
        elements = (E[])new Object[DEFAULT_iNITIAL_CAPACITY];
    }
    public void push(E e){
        ensureCapacity();
        elements[Size++] = e;
    }
    public void pushAll(Iterable<? extends E> src){
        for (E e : src)
            push(e);
    }
    public E pop(){
        if(Size == 0)
            throw  new EmptyStackException();
        E result = elements[--Size];
        elements[Size] = null;
        return result;
    }
    public void popAll(Collection<? super E> dst){
        while (!isEmpty())
            dst.add(pop());
    }
    public boolean isEmpty(){
        return Size==0;
    }
    private void ensureCapacity(){
        if(elements.length == Size)
            elements = Arrays.copyOf(elements,2*Size+1);
    }
}
