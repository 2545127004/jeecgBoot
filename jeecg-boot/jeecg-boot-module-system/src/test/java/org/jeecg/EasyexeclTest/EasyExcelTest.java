package org.jeecg.EasyexeclTest;

import cn.hutool.poi.excel.sax.ExcelSaxReader;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.read.listener.ReadListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class EasyExcelTest {
    public static void main(String[] args) throws IOException {
         String  filepath="D:\\demo\\UserTest.xlsx";
        //ExcelSaxReader<UserE> esr=null;
        EasyExcel.read(filepath, UserE.class, (ReadListener) new ExcelLinster()).sheet().doRead();


    }



}
