package com.lnson.pattern.demo.component;

import com.sun.istack.internal.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    public String formatDate(@NotNull Long timeStamp) {
        System.out.println("DateHelper.formatDate()被调用");
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(timeStamp / 1000));
    }


}
