package org.jeecg.modules.wmall.utils;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import org.jeecg.common.util.RestUtil;
import org.jeecg.modules.wmall.from.UserInfoFrom;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class mallToken {
    private final  static String  BaseUrl="http://47.93.91.99:8086/wmall/";
    private static String token ="";
    public  static String  getToken() throws IOException {
//        Socket socket=new Socket("http://47.93.91.99",8086);
//        socket.setSoTimeout(3000);
        Map<String,Object> map =new HashMap<>();
        map.put("phone","15960221148");
        map.put("password","123456");
       JSONObject jsonObject=   RestUtil.post(BaseUrl+"app/login", JSONObject.parseObject(JSONObject.toJSONString(map)));
        System.out.println(jsonObject);
        token=jsonObject.get("token")+"";
       return jsonObject.get("token")+"";
    }
    private static   UserInfoFrom getUserInfo(Long uid) throws IOException {
        //RestUtil.SetToken(getToken());
        JSONObject jsonObject=   RestUtil.get(BaseUrl+"wmall/app/userInfo?token="+token);
       if(jsonObject.get("code")!="401"){
        return JSONObject.parseObject(jsonObject.get("data")+"",UserInfoFrom.class);}
        else{
            return null;
       }
    }



    public static void main(String[] args) {

        try {
            Long id =Long.valueOf("8");
            getToken();
            UserInfoFrom user= getUserInfo(id);
            System.out.println(user.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
