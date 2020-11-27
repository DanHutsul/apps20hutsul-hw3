package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray{
    private Object[] array;

    public BaseArray(Object[] array) {
        if (array == null) {
            throw new NullPointerException();
        }
        this.array = array.clone();
    }

    @Override
    public Object[] toArray() {
        return array.clone();
    }

    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    public String operationDescription() {
        return "Creates an instance of BaseArray";
    }

    @Override
    public int size() {
        return array.length;
    }

}
