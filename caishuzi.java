package com.lianxi;
import java.util.Scanner;
import java.util.Random;

public class caishuzi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int b = r.nextInt(1,101);
        int c = 0;
        int d = 0;
        while (true) {
            c++;
            d++;
            System.out.println("请输入一个数：");
            int a = sc.nextInt();
            if (d == 10) {
            a=b;
            }
            if (a > b) {
                System.out.println("大了");
            }
            else if (a < b) {
                System.out.println("小了");
            }
            else {
                System.out.println("恭喜您，猜对了！");
                break;
            }
            if (c%5 == 0) {
                System.out.println("数字范围是"+(b-5)+"~"+(b+5)+"之间");
            }
            if (d == 9) {
                System.out.println("下一次输入的数字必定正确");
            }
        }
    }
}
