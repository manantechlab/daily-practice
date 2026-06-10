class concatenation {

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }

        return ans;
    }

    public static void main(String[] args) {
        concatenation obj = new concatenation();

        int[] nums = {1, 3, 2, 1};
        int[] result = obj.getConcatenation(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}