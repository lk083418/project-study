package imooc.test2.test;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

public class main2 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        JSONObject jsonObject = new JSONObject(map);
        Object aa = jsonObject.get("aa");
        System.out.println(aa);
    }
}
