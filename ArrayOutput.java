package xier;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.LockSupport;

public class ArrayOutput extends Thread{
    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.next();
        String[] scanner1 = str1.split(",");
        int[] arr1 = new int[scanner1.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=Integer.parseInt(scanner1[i]);
        }


        String str2 = sc1.next();
        String[] scanner2 = str2.split(",");
        int[] arr2 = new int[scanner2.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=Integer.parseInt(scanner2[i]);
        }

        output(arr1,arr2);

    }

    public static void output(int[] arr1, int[] arr2){
        new Thread(){
            @Override
            public void run(){
                synchronized(arr1){
                    for(int x:arr1){
                        System.out.print(x+",");
                        try{
                            arr1.notify();
                            arr1.wait(10);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                };
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                synchronized(arr2){
                    for(int x:arr2){
                        System.out.print(x+",");
                        try{
                            arr2.notify();
                            arr2.wait(10);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                };
            }
        }.start();
    }
}

