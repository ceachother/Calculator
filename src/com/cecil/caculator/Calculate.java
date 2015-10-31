package com.cecil.caculator;

import com.cecil.bean.Memory;

/**
 * Created by cecillee on 27/10/15.
 */
public  class Calculate {

    public static String calculate(Memory memory) throws Exception {
        Double value = memory.getValue().equals("") ? 0: Double.valueOf(memory.getValue());
        Double memoryValue = memory.getMemoryValue().equals("") ? 0:Double.valueOf(memory.getMemoryValue());
        String operator = memory.getOperator();

        if ("+-".contains(operator))
        {
            value = Double.valueOf( operator + value.toString() );
            memoryValue = memoryValue + value;
        }
        else if (operator.equals("*"))
        {
            memoryValue *= value;
        }
        else if (operator.equals("/"))
        {
            if ( value == 0)
                throw new Exception("the divider cannot be zero");
            memoryValue /= value;
        }
        return memoryValue.toString();
    }
}
