package com.lianxi;

import java.util.Scanner;

public class kalazihanshu {

    //打印
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = sc.nextInt();
        int a = n/2;
        int b = n*3+1;
        int c = n%2;
        if(c==0){
            System.out.println("偶数,n/2");
            System.out.println(a);
        }else {
            System.out.println("奇数,n*3+1");
            System.out.println(b);
        }
    }
}
