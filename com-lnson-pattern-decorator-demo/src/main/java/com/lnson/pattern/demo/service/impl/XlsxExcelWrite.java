package com.lnson.pattern.demo.service.impl;

import com.lnson.pattern.demo.service.ExcelWrite;

public class XlsxExcelWrite implements ExcelWrite {

    @Override
    public void write() {
        System.out.println("2007版excel(*.xlsx)写入");
    }

}
