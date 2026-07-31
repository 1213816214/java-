package lianxi;
import java.util.Scanner;
public class liangshuzhihe {
    // 输入一个数字，求出所有和为该数字的组合,并输出它们的数组索引。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new  int[10];
        System.out.println("请输入数字");
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
            for (int j = i; j <arr.length; j++){
                arr[j]= j;
                if(arr[i]+arr[j] == a){
                    System.out.print("和为该数字的组合"+arr[i] + "和" +arr[j]+ "\t");
                    System.out.print("它们的数组索引"+i + " " + j);
                    System.out.println();
                }
            }
        }
    }
}
