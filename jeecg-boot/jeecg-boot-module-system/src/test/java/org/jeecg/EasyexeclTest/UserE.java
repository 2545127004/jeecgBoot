package org.jeecg.EasyexeclTest;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.errorprone.annotations.NoAllocation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserE   extends BaseRowModel {
    @ExcelProperty(value = "姓名",index = 0)
    private String name;
    @ExcelProperty(value = "生日",index = 1,converter =DateUtil.class )
    @DateTimeFormat(pattern="yyyy.MM.dd")
    private Date birthday;
    @ExcelProperty(value = "年龄",index = 2)
    private Integer age;
    @ExcelProperty(value ="性别",index = 3,converter = SexConverter.class)
    private Integer sex;
//    @ExcelProperty()
//    private String userInfo;
    @ExcelProperty(value = {"用户信息" ,"手机"},index = 4)
    private String phone;
    @ExcelProperty(value = {"用户信息" ,"邮箱"},index = 5)
    private String email;


}
