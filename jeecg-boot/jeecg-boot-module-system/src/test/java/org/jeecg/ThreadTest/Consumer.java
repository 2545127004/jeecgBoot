package org.jeecg.ThreadTest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class Consumer implements  Runnable {

    private Storage storage;

    public Consumer(){}

    public Consumer(Storage storage , String name){
        this.storage = storage;
    }
    public Consumer(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(2000);
                storage.consume();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
