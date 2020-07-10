package org.jeecg.ThreadTest;

import java.util.LinkedList;

public class Storage {
    //最大库存容量
    private final int Max_Size=10;
    //库存储存载体
    private LinkedList<Object> list =new LinkedList<>();
    //生产者库存
    public void produce(){
        //加锁，防止重复和超量消费
        synchronized (list){
            while (list.size()+1>Max_Size){
                System.out.println("[生产者"+Thread.currentThread().getName()+"] 仓库满了");
            try{
                //仓库满，停止生产
                list.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            }
            list.add(new Object());
            System.out.println("【生产者" + Thread.currentThread().getName()
                    + "】生产一个产品，现库存" + list.size());
            list.notifyAll();
        }


    }
    //消费者库存
    public void consume() {
        synchronized (list) {
            while (list.size() == 0) {
                System.out.println("【消费者" + Thread.currentThread().getName()
                        + "】仓库为空");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove();
            System.out.println("【消费者" + Thread.currentThread().getName()
                    + "】消费一个产品，现库存" + list.size());
            list.notifyAll();
        }
    }


}
