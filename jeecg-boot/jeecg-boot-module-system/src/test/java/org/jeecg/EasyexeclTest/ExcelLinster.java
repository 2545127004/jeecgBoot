package org.jeecg.EasyexeclTest;


import cn.hutool.poi.excel.sax.handler.RowHandler;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.CellExtra;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.fastjson.JSON;
import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class ExcelLinster extends AnalysisEventListener<UserE> implements ReadListener<UserE> {


    private List<UserE> list=new ArrayList<>();

    @Override
    public void invoke(UserE object, AnalysisContext context) {


        System.out.println( "数据："+object.toString());

        list.add(object);
        if(list.size()<=0){
            System.out.println("数据导入异常");
            return;
        }

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
    @Override
    public void extra(CellExtra var1, AnalysisContext var2){

    }

     @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {

         System.out.println(context.getCurrentRowNum());
         System.out.println("表头" + JSON.toJSONString(headMap));
    }


    @Override
    public void onException(Exception exception, AnalysisContext context) throws Exception {
        super.onException(exception, context);
    }
}
