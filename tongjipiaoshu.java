package lianxi;
import java.util.Random;
public class tongjipiaoshu {
    //票数统计
    public static void main(String[] args){
        Random r = new Random();
        int arr [] = new int[6];
        //模拟1000次投票
        for (int i = 1; i <=1000; i++){
            int num = r.nextInt(0,6);
            arr[num]++;
        }
        //输出每个候选人的票数和得票率
        for (int i = 1; i < arr.length; i++){
            System.out.print(i+"号候选人有"+arr[i]+"票"+"\t");
            double a = arr[i]/1000.0*100.0;
            System.out.println("得票率约为"+a+"%");
        }
        //输出弃权票数和弃权得票率
        System.out.print("弃权有"+arr[0]+"票"+"\t");
        double b = arr[0]/1000.0*100.0;
        System.out.println("弃权得票率为"+b+"%");
        int c = arr[1];
        //找出得票最多的候选人
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > c){
                c = arr[i];
            }
        }
        //输出得票最多的候选人
        for (int i = 1; i < arr.length; i++){
            if (arr[i] == c){
                System.out.println(i+"号候选人得票最多");
            }
        }
    }
}
