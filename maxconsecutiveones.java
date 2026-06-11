public class maxconsecutiveones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res =0;
        int count = 0;

        for(int n : nums)
        {
            if (n==0){
                count =0;
            }
            else{
                count++;
            }
            if(res < count){
                res =count;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        maxconsecutiveones obj = new maxconsecutiveones();

        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = obj.findMaxConsecutiveOnes(nums);

        System.out.println("Maximum number of consecutive ones: " + result);
    }
}
