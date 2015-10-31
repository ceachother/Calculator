package com.cecil;

import com.cecil.bean.InputTypeEnum;
import com.cecil.bean.Memory;
import com.cecil.handler.Handler;
import com.cecil.handler.HandlerFactory;


/**
 * Created by cecillee on 27/10/15.
 */
public class Printer {

    private Memory memory = new Memory("","","");


    public String print(String num) throws Exception {

        HandlerFactory factory = new HandlerFactory();
        Integer type = InputTypeEnum.typeOf(num);
        if (type == 0)
        {
            throw new Exception("The operation is not allowed:" + num);
        }

        Handler handler = factory.createHandler(type);

        String result;
        try{
            result = handler.handle(memory,num);
        }
        catch (Exception e)
        {
            throw new Exception("unrecognized operation,what is wrong with you?????");
        }

        if (result.endsWith(".0"))
        {
            result = result.replace(".0","");
        }
        return result;
    }



}

