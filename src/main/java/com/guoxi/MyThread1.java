package com.guoxi;

public class MyThread1 implements  Runnable{
    public static void main(String args[]){
        MyThread1 myThread1=new MyThread1();
        new Thread(myThread1).start();
    }

    public void run() {
        for (int i=0;;i++){
            System.out.println("i:--------------------->"+i);
        }
    }
}
