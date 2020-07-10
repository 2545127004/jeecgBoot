package org.jeecg.modules.rabbitMq;

import lombok.extern.java.Log;
import org.jeecg.config.rabbitMq.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者
 */
@Component
@Log
public class MsgReceiver {

    @RabbitHandler //监听消息
    @RabbitListener(queues = RabbitConfig.QUEUE_A)//监听队列
    public void process(String content) {
        log.info("消费者1接收处理队列A当中的消息： " + content);
    }

    @RabbitHandler //监听消息
    @RabbitListener(queues = RabbitConfig.QUEUE_B)//监听队列
    public void processB(String content) {
        log.info("接收处理队列B当中的消息： " + content);
    }
    @RabbitHandler //监听消息
    @RabbitListener(queues = RabbitConfig.QUEUE_A)//监听队列
    public void processC(String content) {
        log.info("消费者2接收处理队列A当中的消息： " + content);
    }
}
