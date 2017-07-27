package Annotation;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** 
 * @author  李林林 
 * @date 2017年7月20日 下午6:08:32 
 * @since
 */
public class Consumer {
	public static void main(String[] args) {  
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);  
		AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);  
		System.out.println("Received: " + amqpTemplate.receiveAndConvert());  
	}  
}
