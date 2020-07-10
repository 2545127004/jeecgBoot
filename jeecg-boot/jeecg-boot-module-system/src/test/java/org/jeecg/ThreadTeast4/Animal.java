package org.jeecg.ThreadTeast4;

import java.math.BigDecimal;

public abstract class Animal extends  Thread {
    public double length=20 ;
    public BigDecimal len=new BigDecimal(length+"");
    public abstract void runing();

    @Override
    public void run() {
        super.run();
        while (length>0){
        runing();}
    }

    public static  interface  CallBack{
       public  void Win();
    }
   public  CallBack callBack;
}
