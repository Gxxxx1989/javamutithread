package com.guoxi;

public class MyThread extends  Thread {
    public static  void  main(String [] args){
        MyThread myThread=new MyThread();
        myThread.start();
        for (int i=0;;i++){
            System.out.println(i++);
        }
    }
}
