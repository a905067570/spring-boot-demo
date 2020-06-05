package com.example.springbootthreaddemo.service;

/**
 * Created by LB on 2020/6/4
 */
public interface SMSClient {

    String sendSMS(String mobile) throws InterruptedException;
}
