package org.jeecg.EasyexeclTest;


import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.jeecg.common.util.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil implements Converter {


    @Override
    public Class supportJavaTypeKey() {
        return null;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return null;
    }

    @Override
    public Object convertToJavaData(CellData cellData, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {
      String string=cellData.getStringValue();
        SimpleDateFormat format=new SimpleDateFormat("yyyy.MM.dd");
        Date date= DateUtils.str2Date(string,format);

        return date;
    }

    @Override
    public CellData convertToExcelData(Object o, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return null;
    }
}
