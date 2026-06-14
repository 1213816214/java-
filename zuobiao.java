package com.lianxi;
import java.util.Scanner;
public class zuobiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x轴：");
        int x = sc.nextInt();
        System.out.println("请输入y轴：");
        int y = sc.nextInt();
        if (x>0&&y>0){
            System.out.println("在"+"第1象限");
        }
        else if (x<0&&y>0){
            System.out.println("在"+"第2象限");
        }
        else if (x<0&&y<0){
            System.out.println("在"+"第3象限");
        }
        else if (x>0&&y<0){
            System.out.println("在"+"第4象限");
        }
        else if (x==0&&y>0){
            System.out.println("在"+"y轴");
        }
        else if (x>0&&y==0){
            System.out.println("在"+"x轴");
        }
        else if (x==0&&y<0){
            System.out.println("在"+"y轴");
        }
        else if (x<0&&y==0){
            System.out.println("在"+"x轴");
        }
        else {
            System.out.println("原点");
        }
    }
}
