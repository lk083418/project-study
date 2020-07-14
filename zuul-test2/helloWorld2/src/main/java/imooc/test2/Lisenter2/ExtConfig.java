package imooc.test2.Lisenter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("imooc.Lisenter2")
@Configuration
public class ExtConfig {
	@Bean
	public String blue(){
		return "sss";
	}
}