package lianxi;
import java.util.Random;
import java.util.Scanner;
public class daletou {
    //大乐透双色球
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shuruarr[] = new int[5];//输入红球号码
        int shuruarr1[] = new int[2];//输入蓝球号码
        System.out.println("请输入购买红球号码：");
        haomashuri(shuruarr);
        System.out.println("请输入购买蓝球号码：");
        haomashuri(shuruarr1);
        int suijiarr[] = new int[5];//数组随机号码生成
        int suijiarr1[] = new int[2];//数组随机号码生成
        suijiarr = haomadayi(suijiarr,35);
        //输出红球
        System.out.println("红球号码：");
        for (int i = 0; i < suijiarr.length; i++)
            System.out.print(suijiarr[i] + " ");
        suijiarr1 = haomadayi(suijiarr1,12);
        //输出蓝球
        System.out.println();
        System.out.println("蓝球号码：");
        for (int i = 0; i < suijiarr1.length; i++){
            System.out.print(suijiarr1[i] + " ");
        }
        System.out.println();
        int c = 0;//红球中奖次数
        System.out.println("我输入的红球号码为");
        for (int i = 0; i < shuruarr.length; i++){
            System.out.print(shuruarr[i] + " ");
            for (int j = 0; j < suijiarr.length; j++){
                if (shuruarr[i] == suijiarr[j]) {
                    c++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("红球中奖次数为：" + c);
        int d = 0;//蓝球中奖次数
        System.out.println("我输入的蓝球号码为");
        for (int i = 0; i < shuruarr1.length; i++){
            System.out.print(shuruarr1[i] + " ");
            for (int j = 0; j < suijiarr.length; j++){
                if (shuruarr[i] == suijiarr[j]) {
                    d++;
                    break;
                }
            }
        }
        System.out.println("蓝球中奖次数为：" + d);
        System.out.println("中奖总次数为：" + (c + d));
    }
    //号码生成方法
    public static int[] haomadayi(int[] arr,int n) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            int a = rand.nextInt(n)+1;
            arr[i] = a;
            for (int j = 0; j < i; j++){
                if (a==arr[j])i--;break;
            }
        }
        return arr;
    }
    //号码输入方法
    public static void haomashuri(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        while (b < arr.length){
            System.out.println("请输入购买号码：");
            int c = sc.nextInt();
            int d = 0;
            for (int i = 0; i < b; i++) {
                if (c == arr[i]) {
                    d++;
                    break;
                }
            }
            if (c <=35 && c > 0 && d == 0){
                arr[b] = c;
                System.out.println(arr[b]);
                b++;
            }
            else {
                d--;
                System.out.println("输入错误，请重新输入");
            }
        }
    }
}
