package imooc.test2.test;

import org.springframework.scheduling.annotation.Scheduled;

public class ThreadMethod {
    @Scheduled(cron = "0/10 * * * * ?")
    public void test(){
        System.out.println("aaa");
    }


    public static void main(String[] args) {

        String string = "abc-bbb";
        String[] split = string.split("-");
        String str1 = split[1];
        String substring = str1.substring(2);
        System.out.println(str1);
        System.out.println(substring);
    }

}
