import java.util.List;        
import java.util.ArrayList;


class findallarray{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int []frq=new int[nums.length+1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
         int t=nums[i];
         frq[t]++;
        }

        for(int i=1; i<=nums.length; i++){
            if(frq[i]==0){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        findallarray obj = new findallarray();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = obj.findDisappearedNumbers(nums);

        System.out.print("Output: [");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}