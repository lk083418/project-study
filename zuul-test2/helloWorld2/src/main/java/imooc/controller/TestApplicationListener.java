package imooc.controller;

import imooc.service.WalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
public class TestApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    private final WalkService walkService;

    @Autowired
    public TestApplicationListener(WalkService walkService) {
        this.walkService = walkService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if(contextRefreshedEvent.getApplicationContext().getParent() == null){
            Thread thread = new Thread(walkService);
            thread.start();
//            System.out.println(contextRefreshedEvent);
            System.out.println("TestApplicationListener............................");
        }

    }
}