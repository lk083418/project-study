package imooc.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import imooc.pojo.SatVo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class helloWord2 {
    @Value("${param.addr}")
    private String addr;
    @PostMapping("/helloworld")
    public String helloWord2(){
        ////("hello world!");
        return "hello world!2";
    }

    /**
     *
     * @param satVo
     * @return
     * @throws JsonProcessingException
     */
    @PostMapping("/testVo")
    public HashMap<String, List<Map>> testVo(@RequestBody SatVo satVo) throws JsonProcessingException {
        System.out.println(addr);
        ////(satVo.getId());
        ////(satVo.getName());
        ////(satVo.getSex());
        ////(satVo.getId()+500);

        String result = new Gson().toJson(satVo);

//        String result = new ObjectMapper().writeValueAsString(satVo);
//        System.out.println(value);
        System.out.println(satVo);
        List<Map> stringList = new ArrayList<>();
        Map sss = JSON.parseObject(result, Map.class);

        stringList.add(sss);
        stringList.add(sss);
        HashMap<String, List<Map>> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("aa",stringList);
        return objectObjectHashMap;
    }
    @PostMapping("/testVo2")
    public HashMap<String, List<Map>> testVo2(@RequestBody SatVo satVo) throws JsonProcessingException {


        JSONObject jsonObject = new JSONObject();
        try {
            Object aa = jsonObject.get("aa");
        }catch (Exception e){
            System.out.println("aa");
        }
        return null;
    }
}
