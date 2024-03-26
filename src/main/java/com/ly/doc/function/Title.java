package com.ly.doc.function;

import org.beetl.core.Context;
import org.beetl.core.Function;

import java.util.ResourceBundle;

public class Title  implements Function {
    @Override
    public Object call(Object[] paras, Context ctx) {
        String str = String.valueOf(paras[0]);

        ResourceBundle bundle = ResourceBundle.getBundle("C:\\Users\\abing\\Desktop\\test\\messages");

        System.out.println(bundle.getString("greeting"));

        return null;
    }
}
