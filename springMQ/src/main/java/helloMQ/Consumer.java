package helloMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @author  李林林 
 * @date 2017年7月20日 下午4:17:00 
 * @since
 */
public class Consumer {
	public static void main(String[] args) {  
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        AmqpTemplate amqpTemplate = context.getBean(RabbitTemplate.class);    
        System.out.println("Received: " + amqpTemplate.receiveAndConvert());    
    }  
}
