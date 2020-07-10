package org.jeecg.ThreadTeast4;

import java.math.BigDecimal;

public class Rabbit extends  Animal {


    public Rabbit() {
        setName("兔子");// Thread的方法，给线程赋值名字
    }

    @Override
    public void runing() {
        //每次跑的距离
        BigDecimal  dis=new BigDecimal("0.5");
        //剩余的距离
        len=len.subtract(dis);
       // len=new BigDecimal(length+"");
        while (len.compareTo(new BigDecimal("0"))<=0){
            length=0;
            System.out.println("兔子获得胜利");
            if (callBack != null) {
                callBack.Win();
            }
            this.stop();

        }
        System.out.println("兔子跑了" + dis + "米，距离终点还有" +len + "米");

        if (length % 2 == 0) {// 两米休Win息一次
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
