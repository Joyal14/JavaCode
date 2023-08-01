import java.util.Arrays;

public class infinateLoop {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11};
        int target = 11;
        System.out.println(ans(arr,target));
    }

    static int binerySearch(int[] arr, int target,int start,int end) {
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
        return -1;
    }
    static int ans(int [] arr,int target){
        int start =0;
        int end= 1;

        //condition for the target to lie in rage
        while(target>arr[end]){
            //store the value in new variable,so we can implement in double
            int new_start = end +1;
            //double the box of it
//            end = end +(end-start +1)*2;
            end =end *2;
            start = new_start;
        }
        return binerySearch(arr,target,start,end);
    }
}
