package lianxi;
import java.util.Scanner;
public class fangfajisuanfenshu {
    //方法计算班级分数
    public static void main(String[] args) {
        double arr[] = new double[5];
        chengji(arr);
        double jiger = jiger(arr);
        System.out.println("及格人数为:"+jiger);
        System.out.println("及格率为:"+jigelv(arr,jiger)+"%");
        System.out.println("总分为:"+congf(arr));
        System.out.println("平均分为:"+pingjunfen(arr,congf(arr)));
        System.out.println("最高分为:"+zuidafen(arr));
    }
    //成绩
    public static void chengji(double[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("请输入第"+(i+1)+"个人的分数:");
            double a = sc.nextInt();
            if (a <= 100 & a > 0) arr[i] = a;
            else {
                System.out.println("输入错误");
                i--;
            }
        }
    }
    //及格人数,及格率
    public static double jiger(double[] arr){
        int a = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 60) a++;
        }
        return a;
    }
    //及格率
    public static double jigelv(double[] arr,double jiger){
        return (jiger/arr.length)*100;
    }
    //总分
    public static double congf(double[] arr){
        int a = 0;
        for (int i = 0; i < arr.length; i++)a+=arr[i];
        return a;
    }
    //平均分
    public static double pingjunfen(double[] arr,double congf){
        return congf(arr)/arr.length;
    }
    //最高分
    public static double zuidafen(double[] arr){
        double a = arr[0];
        int i = 0;
        while (i+1<arr.length){
            if(arr[i]<arr[i+1]) a=arr[i+1];
            i++;
        }
        return a;
    }
}
