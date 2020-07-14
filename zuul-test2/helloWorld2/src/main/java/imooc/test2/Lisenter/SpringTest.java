package imooc.test2.Lisenter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    public static void main(String args[]){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExtConfig.class);

        //创建一个ApplicationEvent对象

        EmailEvent event = new EmailEvent("hello","abc@163.com","This is a test");

        //主动触发该事件

        context.publishEvent(event);
        context.close();

    }
}
