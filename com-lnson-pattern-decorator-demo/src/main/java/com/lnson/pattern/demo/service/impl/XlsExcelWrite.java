package com.lnson.pattern.demo.service.impl;

import com.lnson.pattern.demo.service.ExcelWrite;

public class XlsExcelWrite implements ExcelWrite {

    @Override
    public void write() {
        System.out.println("2003版excel(*.xls)写入");
    }

}
