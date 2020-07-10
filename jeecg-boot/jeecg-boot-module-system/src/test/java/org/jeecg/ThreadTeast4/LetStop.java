package org.jeecg.ThreadTeast4;

public class LetStop implements Animal.CallBack {
    Animal animal;
    public  LetStop(Animal animal){
        this.animal=animal;
    }
    //获得胜利，动物线程停止
    @Override
    public void Win() {
        animal.stop();
    }
}
