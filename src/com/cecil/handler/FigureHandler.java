package com.cecil.handler;

import com.cecil.bean.Memory;

/**
 * Created by cecillee on 29/10/15.
 */
public class FigureHandler extends Handler {

    @Override
    public String handle(Memory memory, String input) {
        String result = input;
        if( ! memory.getValue().equals("") )
        {
            result = memory.getValue() + input;
        }
        memory.setValue(result);
        return result;
    }
}
