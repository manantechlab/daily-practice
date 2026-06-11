public class shufflethearray {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        for(int i=0; i<len; i++){
            if(i % 2 == 0){
                ans[i] = nums[i/2];
            }
            else{
                ans[i]= nums[n +(i / 2)];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        shufflethearray obj = new shufflethearray();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = obj.shuffle(nums, n);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
