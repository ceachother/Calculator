package com.cecil.handler;

import com.cecil.bean.InputTypeEnum;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by cecillee on 29/10/15.
 */
public class HandlerFactory {

    private static HandlerFactory factory = new HandlerFactory();

    public HandlerFactory() {
    }

    private static Map<Integer,Handler> handlerMap = new HashMap<Integer,Handler>();

    static {
        handlerMap.put(InputTypeEnum.FIGURE.type(),new FigureHandler());
        handlerMap.put(InputTypeEnum.OPERATOR.type(),new OperatorHandler());

        handlerMap.put(InputTypeEnum.POINT.type(),new PointHandler());
        handlerMap.put(InputTypeEnum.MC.type(),new ClearHandler());

        handlerMap.put(InputTypeEnum.BRACKET.type(),new BracketHandler());
        handlerMap.put(InputTypeEnum.COMPLEMENTOR.type(),new ComplementorHandler());
    }

    public Handler createHandler(Integer type)
    {
        return handlerMap.get(type);
    }
}
