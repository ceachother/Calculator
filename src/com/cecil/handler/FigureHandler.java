package com.cecil.handler;

import com.cecil.bean.Memory;

/**
 * Created by cecillee on 29/10/15.
 */
public class FigureHandler extends Handler {

    @Override
    public String handle(Memory memory, String input) {
        String result = input;
        String value = memory.getValue().equals("") ? "0":memory.getValue();
        if( !value.equals("0"))
        {
            result = memory.getValue() + input;
        }
        memory.setValue(result);
        return result;
    }
}
