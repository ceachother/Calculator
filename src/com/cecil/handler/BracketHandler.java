package com.cecil.handler;

import com.cecil.bean.Memory;
import com.cecil.caculator.Calculate;

/**
 * Created by cecillee on 31/10/15.
 */
public class BracketHandler extends Handler {

    @Override
    public String handle(Memory memory, String input) throws Exception {

        String result;
        if (input.equals("("))
        {
            result = handleOpenBracket(memory);
        }
        else
        {
            result = handleCloseBracket(memory);
        }
        return result;
    }


    private String handleOpenBracket(Memory memory)
    {

        String result = memory.getMemoryValue().equals("") ? "0":memory.getMemoryValue();
        //clear the memory if input the figure and open bracket in a row
        String value = memory.getValue();
        if (!value.equals(""))
        {
            memory.clear();
            result = "0";
        }
        memory.lock();
        return result;
    }

    private String handleCloseBracket(Memory memory) throws Exception {
        if (memory.getLimboList().size()<1)
        {
            return "0";
        }
        //calculate the value in the brackets
        String result = Calculate.calculate(memory);
        memory.setValue(result);
        memory.unlock();
        return result;
    }

}
