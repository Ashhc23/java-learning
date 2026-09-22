import java.util.Arrays;

public class arrayDemo{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
        System.out.println(Arrays.toString(arr));}
        System.out.println(arr.length);
        int[] arr2={1,2,3,4,5};
        System.out.println(Arrays.equals(arr,arr2));
        System.out.println(Arrays.binarySearch(arr,3));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}