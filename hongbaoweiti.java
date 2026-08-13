package lianxi;
import java.util.Scanner;
import java.util.Random;
public class hongbaoweiti {
    //红包问题
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入红包金额：");
        int a = sc.nextInt();//红包金额
        while (a <= 0){
            System.out.println("红包金额不能小于等于0，请重新输入：");
            System.out.println("请输入红包金额：");
            a = sc.nextInt();
        }
        System.out.println("请输入红包个数：");
        int b = sc.nextInt();//红包个数
        while (a < b && b <= 0){
            System.out.println("红包金额不能小于红包个数，请重新输入：");
            System.out.println("请输入红包个数：");
            b = sc.nextInt();
        }
        int c = 1;        //每次红包最小金额
        int d = 0;
        for (int i = 1; i < b; i++){
            int e = r.nextInt(c,a-(b-i)-d);
            d += e;
            System.out.println("第"+i+"个红包金额为");
            System.out.println(e+"元");//打印每次红包金额
        }
        System.out.println("第"+b+"个红包金额为");
        System.out.println((a-d)+"元");//打印最后一个红包金额
    }
}
