package org.jeecg.ThreadTest3;

import java.util.concurrent.LinkedBlockingQueue;

public class Storage {

    // 仓库存储的载体,BlockingQueue阻塞队列，当队列大小达到最大时自动停止。
    private LinkedBlockingQueue<Object> list = new LinkedBlockingQueue<>(10);

    public void produce() {
        synchronized (list) {
            while (list.size() + 1 > 10) {
                System.out.println("【生产者" + Thread.currentThread().getName()
                        + "】仓库已满");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                list.put(new Object());
                System.out.println("【生产者" + Thread.currentThread().getName()
                        + "】生产一个产品，现库存" + list.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

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

            try {
                list.take();
                System.out.println("【消费者" + Thread.currentThread().getName()
                        + "】消费了一个产品，现库存" + list.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
