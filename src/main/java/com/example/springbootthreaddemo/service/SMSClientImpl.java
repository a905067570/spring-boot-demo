package com.example.springbootthreaddemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LB on 2020/6/4
 */
@Service
public class SMSClientImpl implements SMSClient {

    private static final String SEND_URL = "";

    @Value("${yp.apiKey}")
    private String apiKey;

    @Override
    public String sendSMS(String mobile){
        Map<String,Object> params = new HashMap<>();
        params.put("apiKey",apiKey);
        params.put("mobile",mobile);
        params.put("text","亲爱的xxx，您的xxxxxxxx。。。。。");
        return post(SEND_URL,params);
    }

    private static String post(String url, Map<String,Object> params){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    }
}
