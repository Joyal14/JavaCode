import java.util.Arrays;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 8, 31};
        int target = 6;
        int ans = flooers(arr, target);
        System.out.println("ans is "+ans);
    }

    static int flooers(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target>arr[mid]){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
