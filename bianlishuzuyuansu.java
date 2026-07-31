package lianxi;
public class bianlishuzuyuansu {
    // 遍历打印数组全部元素
    //求数组所有数字的总和
    //求数组里面最大值、最小值
    public static void main(String[] args) {
        int arr[] = {2,3,6,4,8,10};
        int a = 0;
        int b = 0;
        int c = arr[0];
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
            a = a+arr[i];
            if (b<arr[i]){
                b = arr[i];
            }
            for (int j = i; j < arr.length; j++)
                if (c>arr[j]&&j<=i){
                    c = arr[j];
                }
        }
        System.out.println("数组所有数字的总和");
        System.out.println(a);
        System.out.println("数组里面最大值");
        System.out.println(b);
        System.out.println("数组里面最小值");
        System.out.println(c);
    }
}
