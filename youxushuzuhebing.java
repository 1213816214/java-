package lianxi;
public class youxushuzuhebing {
    // 合并两个有序数组
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int arr1[] = {2,4,6,8,10};
        int arr2[] = new int[arr.length+arr1.length];
        int a = 0;
        int b = 0;
        int c = 0;
        while (a<arr.length&&b<arr1.length){
            if (arr[a]<arr1[b]){
                arr2[c] = arr[a];
                c++;
                a++ ;
            }
            else {
                arr2[c] = arr1[b];
                c++;
                b++;
            }
        }
        while (a<arr.length){
            arr2[c] = arr[a];
            c++;
            a++;
        }
        while (b<arr1.length){
            arr2[c] = arr1[b];
            c++;
            b++;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
