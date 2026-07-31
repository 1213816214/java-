package lianxi;
public class quchongyouxushuzu {
    //数组是递增有序，把重复的去掉
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3,5,7,7,9};
        int a = 0;
        int b = 1;
        while (b<arr.length) {
            if (arr[a] == arr[b]){
                b++;
            }
            else {
                a++;
                arr[a] = arr[b];
                b++;
            }
        }
        for (int i = 0; i <= a; i++)
            System.out.print(arr[i] + " ");
    }
}
