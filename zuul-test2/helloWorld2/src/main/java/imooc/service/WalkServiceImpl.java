package imooc.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class WalkServiceImpl implements WalkService {

    @Scheduled(cron = "0/10 * * * * ?")
    public void print(){
        this.init();
    }



    @Override
    public void init(){
        System.out.println("5555555");
    }

    @Override
    public void run() {

    }
}
