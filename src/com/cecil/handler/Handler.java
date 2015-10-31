package com.cecil.handler;

import com.cecil.bean.Memory;

/**
 * Created by cecillee on 29/10/15.
 */
public abstract class Handler {

    public abstract String handle(Memory memory,String input) throws Exception;
}
