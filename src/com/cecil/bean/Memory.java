package com.cecil.bean;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cecillee on 28/10/15.
 */
public class Memory{

    private String value;

    private String memoryValue;

    private String operator;

    private LinkedList<Limbo> limboList = new LinkedList<Limbo>();

    public String getValue() {
        return value;
    }

    public void setValue(String value) {

        if (value.endsWith(".0"))
        {
            value = value.replace(".0","");
        }
        this.value = value;
    }

    public String getMemoryValue() {
        return memoryValue;
    }

    public void setMemoryValue(String memoryValue) {
        this.memoryValue = memoryValue;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LinkedList<Limbo> getLimboList() {
        return limboList;
    }

    public void setLimboList(LinkedList<Limbo> limboList) {
        this.limboList = limboList;
    }

    public Memory(String value, String memoryValue, String operator) {
        this.value = value;
        this.memoryValue = memoryValue;
        this.operator = operator;
    }

    public Memory() {
    }

    public void clear()
    {
        this.value = "";
        this.memoryValue = "";
        this.operator = "";
    }

    public void lock()
    {
        Limbo limbo = new Limbo();
        limbo.setOperator(this.operator);
        limbo.setMemoryValue(this.memoryValue);
        limboList.add(limbo);
        this.operator = "";
        this.memoryValue = "";
    }

    public void unlock() throws Exception
    {
        Limbo limbo = limboList.removeLast();
        this.operator = limbo.getOperator();
        this.memoryValue = limbo.getMemoryValue();
    }
}
