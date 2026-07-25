package lianxi;
import java.util.Scanner;
public class fengqiguo {
    /*逢7过小游戏：从用户输入的两个整数范围内，遍历报数，
      遇到7的倍数则输出"过"，其余数字正常输出*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++){
            if (i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
