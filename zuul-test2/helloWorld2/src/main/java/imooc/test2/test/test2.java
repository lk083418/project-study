package imooc.test2.test;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {

        HashMap<String, List<Map>> stringListashMap = new HashMap<>();
        HashMap<String, String> map = new HashMap<>();
        JSONObject jsonObject = new JSONObject();

        try {
            Object bb = jsonObject.get("bb");
        }catch (Exception e){

            HashMap<String, String> map1 = new HashMap<>();
            map1.put("aa","aa");
            ArrayList<Map> objects = new ArrayList<>();
            objects.add(map1);
            stringListashMap.put("aa",objects);
        }
        System.out.println(stringListashMap);
        try {
            Object aa = jsonObject.get("aa");
        }catch (Exception e){
            map.put("aa","aa");
//            System.out.println(map);
        }
        System.out.println(map);
    }
}
