package com.cecil.handler;

import com.cecil.bean.Memory;

/**
 * Created by cecillee on 1/11/15.
 */
public class ComplementorHandler extends Handler{

    @Override
    public String handle(Memory memory, String input) throws Exception {
        String value = memory.getValue();
        if (value.equals(""))
        {
            memory.clear();
            value = "0";
        }
        Double result = 0 - Double.valueOf( value );
        memory.setValue(result.toString());
        return result.toString();
    }
}
