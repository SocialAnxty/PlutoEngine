package util;

public class misc {
    public static int intArrayMax(int[] arr){
        if (arr.length == 0){
            throw new IllegalArgumentException("Array has no elements");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
