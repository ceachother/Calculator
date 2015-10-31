package com.cecil.handler;

import com.cecil.bean.Memory;

/**
 * Created by cecillee on 29/10/15.
 */
public class PointHandler extends Handler {

    @Override
    public String handle(Memory memory, String input) throws Exception {
        String result = memory.getValue();
        if ( !result.contains("."))
        {
            result = memory.getValue() + input;
        }
        result = result.equals(".") ? "0.":result;
        memory.setValue(result);
        return result;
    }
}
