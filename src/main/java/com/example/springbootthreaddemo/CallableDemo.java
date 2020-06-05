package com.example.springbootthreaddemo;

import java.util.concurrent.*;

/**
 * Created by LB on 2020/6/4
 */
public class CallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Welcome!");
        Thread.sleep(2000);
        return "SUCCESS";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CallableDemo callableDemo = new CallableDemo();
        Future<String> future = executorService.submit(callableDemo);
        System.out.println(future.get());//future.get()是一个阻塞的方法
        executorService.shutdown();
    }
}
