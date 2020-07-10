package org.jeecg.ThreadTeast4;

public class MainTest {

    public static void main(String[] args) {
       Tortoise tortoise=new Tortoise();
     //  tortoise.setName("乌龟");
       Rabbit rabbit=new Rabbit();
      // rabbit.setName("兔子");
        //回调方法的使用，谁先调用calltoback方法，另一个就不跑了
        LetStop letOneStop1 = new LetStop(tortoise);
        rabbit.callBack = letOneStop1;//让兔子的回调方法里面存在乌龟对象的值，可以把乌龟stop
        LetStop letOneStop2 = new LetStop(rabbit);
        tortoise.callBack = letOneStop2;//让乌龟的回调方法里面存在兔子对象的值，可以把兔子stop

        tortoise.start();
        rabbit.start();
    }
}
