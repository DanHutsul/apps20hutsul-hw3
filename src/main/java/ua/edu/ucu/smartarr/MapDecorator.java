package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray inputArray, MyFunction myFunc) {
        super(inputArray);

        Object[] newSmartArr = smartArray.toArray();

        for (int i = 0; i < smartArray.size(); i++) {
            newSmartArr[i] = myFunc.apply(newSmartArr[i]);
        }

        this.smartArray = new BaseArray(newSmartArr);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray().clone();
    }

    @Override
    public String operationDescription() {
        return "Changes the object class of an element in accordance to myFunc.java";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
