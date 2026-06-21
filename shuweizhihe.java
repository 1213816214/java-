package lianxi;
import java.util.Scanner;
public class shuweizhihe {
    //给定一个整数，请计算其所有数位之和。若为负数，请先取其绝对值。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字");
        int a=sc.nextInt();
        int b=0;
        if (a<0){
            a=-a;
        }
        while(a!=0){
        System.out.println(a%10);
        b=b+a%10;
        a=a/10;
        }
        System.out.println("数位之和为：" +b);
    }
}
