package com.lianxi;
import java.util.Scanner;
public class BMIjianpanluru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重(单位千克):");
        double a = sc.nextDouble();
        if (a>0){
        System.out.println( a );}
        else {
            System.out.println("请输入正确的体重");
        }
        System.out.println("请输入身高(单位米):");
        double b = sc.nextDouble();
        if (b>0){
            System.out.println( b );}
        else {
            System.out.println("请输入正确的身高");
        }
        double c = a/(b*b);
        if (c>0) {
            if (c < 18.5) {
                System.out.println("BMI指数为：");
                System.out.println(c);
                System.out.println("身体状态" + "消瘦");
                System.out.println("健康风险" + "部分增加");
            } else if (c >= 18.5 && c <= 23.9) {
                System.out.println("BMI指数为：");
                System.out.println(c);
                System.out.println("身体状态" + "正常");
                System.out.println("健康风险" + "正常");
            } else if (c >= 24.0 && c <= 26.9) {
                System.out.println("BMI指数为：");
                System.out.println(c);
                System.out.println("身体状态" + "偏胖");
                System.out.println("健康风险" + "增加");
            } else if (c >= 27.0 && c <= 29.9) {
                System.out.println("BMI指数为：");
                System.out.println(c);
                System.out.println("身体状态" + "肥胖");
                System.out.println("健康风险" + "中度增加");
            } else if (c >= 30) {
                System.out.println("BMI指数为：");
                System.out.println(c);
                System.out.println("身体状态" + "严重肥胖");
                System.out.println("健康风险" + "严重增加");
            }
            }else{
                System.out.println("错误");
            }
        }
    }

