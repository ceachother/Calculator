package com.cecil.bean;

/**
 * Created by cecillee on 29/10/15.
 */
public enum InputTypeEnum {

    FIGURE(1,"1234567890"),

    OPERATOR(2,"+-*/="),

    POINT(3,"."),

    MC(4,"MC"),

    BRACKET(5,"()"),
    
    COMPLEMENTOR(6,"COM");

    private int type;

    private String input;

    private InputTypeEnum(int state, String input)
    {
        this.type = state;
        this.input = input;
    }

    public int type()
    {
        return type;
    }

    public String input()
    {
        return input;
    }

    public static int typeOf(String input)
    {
        for (InputTypeEnum type : InputTypeEnum.values())
        {
            if (type.input().contains(input))
            {
                return type.type();
            }
        }
        return 0;
    }
}
