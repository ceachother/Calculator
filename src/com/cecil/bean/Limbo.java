package com.cecil.bean;

/**
 * Created by cecillee on 31/10/15.
 */
public class Limbo {

    private String memoryValue;

    private String operator;

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

    public void clear()
    {
        this.memoryValue = "";
        this.operator = "";
    }
}
