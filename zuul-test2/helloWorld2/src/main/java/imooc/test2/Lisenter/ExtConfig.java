package imooc.test2.Lisenter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("imooc.Lisenter")
@Configuration
public class ExtConfig {
	
	@Bean
	public Blue blue(){
		return new Blue();
	}
 
}