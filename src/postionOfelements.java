public class postionOfelements {


    public static void main(String[] args) {

        int [] nums = {2,3,4,5,6,6,6,7,8,8,9,9,9,10};
        int traget = 1;
        int[] ans = solve(nums,traget);
        System.out.println(ans[0]+" "+ ans[1]);

    }
    static int [] solve(int [] nums,int traget){
        int start = -1;
        int end = -1;
    //serach for first index elemnt
        for(int i=0;i< nums.length-1;i++){
            if(traget == nums[i]){
                start =i;
                break;
            }
        }

        //serach for end index elemnt
        for(int j = nums.length-1; j>0; j--){
            if(traget == nums[j]){
                end = j;
                break;
            }
        }

        return new int[]{start,end};
    }
}


