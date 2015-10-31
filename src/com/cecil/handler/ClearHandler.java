package com.cecil.handler;

import com.cecil.bean.Memory;

/**
 * Created by cecillee on 29/10/15.
 */
public class ClearHandler extends Handler {

    @Override
    public String handle(Memory memory, String input) throws Exception {
        memory.clear();
        return "0";
    }
}
