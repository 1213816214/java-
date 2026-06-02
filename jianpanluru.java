package com.lianxi;
import java.util.Scanner;
public class jianpanluru {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入体重(单位千克):");
    int a = sc.nextInt();
    System.out.println( a );
    System.out.println("请输入身高(单位米):");
    double b = sc.nextDouble();
    System.out.println( b );
    System.out.println("BMI指数为：");
    System.out.println(a/(b*b));
    }
}
