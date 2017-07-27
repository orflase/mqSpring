package Annotation;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** 
 * @author  李林林 
 * @date 2017年7月20日 下午6:08:59 
 * @since
 */
public class Producer {
	public static void main(String[] args) {  
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);  
		AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);  
		amqpTemplate.convertAndSend("Hello World");  
		System.out.println("Sent: Hello World");  
	}  
}
