package org.jeecg.modules.wmall.from;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.crypto.Data;
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoFrom {
private Long id;
private String name;
private String  password;
private int  sex;
private Data birthday;
private String phone;
private String email;
private String image;

}
