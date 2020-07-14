package imooc.test2.Lisenter2;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class IOCTest_Ext {
	
	@Test
	public void test01(){
//		Class<ExtConfig> extConfigClass = ExtConfig.class;
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);
		
		//发布事件；
		applicationContext.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
		});
		
		applicationContext.close();
	}
 
}