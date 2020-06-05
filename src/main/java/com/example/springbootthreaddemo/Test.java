package com.example.springbootthreaddemo;

/**
 * Created by LB on 2020/6/4
 */
public class Test extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.start();
        System.out.println("main thread");
    }
}
