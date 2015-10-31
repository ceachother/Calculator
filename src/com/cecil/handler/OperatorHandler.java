package com.cecil.handler;

import com.cecil.bean.Memory;
import com.cecil.caculator.Calculate;

/**
 * Created by cecillee on 29/10/15.
 */
public class OperatorHandler extends Handler {

    @Override
    public String handle(Memory memory, String input) throws Exception {
        String result = "0";
        if (!memory.getValue().equals(""))
        {
            result = memory.getMemoryValue().equals("") ? memory.getValue():memory.getMemoryValue();
        }

        if ( ! memory.getOperator().equals(""))
        {
            result = Calculate.calculate(memory);
        }
        memory.setOperator(input);
        memory.setMemoryValue(result);
        memory.setValue("");
        return result;
    }
}
