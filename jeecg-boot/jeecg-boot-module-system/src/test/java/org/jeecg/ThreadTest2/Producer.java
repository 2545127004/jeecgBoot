package org.jeecg.ThreadTest2;

import lombok.NoArgsConstructor;
@NoArgsConstructor

public class Producer  implements  Runnable{
    private Storage storage;

    public Producer(Storage storage , String name){
        this.storage = storage;
    }
    public Producer(Storage storage){
        this.storage = storage;
    }
    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
                storage.produce();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
