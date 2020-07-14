package imooc.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class scheuld {
    @Scheduled(cron = "0 0/5 * * * ?")
    public void checkState1() {
        log.info(">>>>> cron中午12:30上传检查开始....");
        log.info(">>>>> cron中午12:30上传检查完成....");
    }
}
