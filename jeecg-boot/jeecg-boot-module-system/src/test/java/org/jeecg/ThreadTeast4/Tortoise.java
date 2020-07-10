package org.jeecg.ThreadTeast4;

import java.math.BigDecimal;

public class Tortoise  extends  Animal{
    public Tortoise() {
        setName("乌龟");// Thread的方法，给线程赋值名字
    }
    @Override
    public void runing() {
        // 重写running方法，编写乌龟的奔跑操作
            // 跑的距离
        BigDecimal  dis=new BigDecimal("0.1");
        //剩余的距离
          len=len.subtract(dis);
            while (len.compareTo(new BigDecimal("0"))<=0) {
                length = 0;
                System.out.println("乌龟获得了胜利");
                if (callBack != null) {
                    callBack.Win();
                }
                this.stop();
                // 让兔子不要在跑了

            }
            System.out.println("乌龟跑了" + dis + "米，距离终点还有" + len + "米");
            try {
                 this.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
